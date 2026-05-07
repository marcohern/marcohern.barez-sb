# EZCLINICME -> Spring Data JPA codegen (read-only)
#
# Connects to the EZCLINICME SQL Server database, introspects schema metadata,
# and emits one @Entity + one Repository<T,ID> per base table into
#   backend/src/main/java/com/marcohern/barez/ezclinic/{entity,repository}.
# Composite-PK tables also get a <Table>Id IdClass.
#
# Re-run after schema changes:
#   pwsh ./backend/tools/ezclinic-codegen/Generate-EzClinic.ps1
#
# Override connection via env vars: EZCLINIC_HOST, EZCLINIC_USER, EZCLINIC_PWD, EZCLINIC_DB
param(
  [string]$Server = $(if ($env:EZCLINIC_HOST) { $env:EZCLINIC_HOST } else { '160.153.178.56\SQLEXPRESS,49510' }),
  [string]$Database = $(if ($env:EZCLINIC_DB) { $env:EZCLINIC_DB } else { 'EZCLINICME' }),
  [string]$User = $(if ($env:EZCLINIC_USER) { $env:EZCLINIC_USER } else { 'sa' }),
  [string]$Password = $(if ($env:EZCLINIC_PWD) { $env:EZCLINIC_PWD } else { 'C0l0mb14m3x$' })
)

$ErrorActionPreference = 'Stop'

# UTF-8 without BOM (javac chokes on BOM)
$Utf8NoBom = New-Object System.Text.UTF8Encoding($false)
function Write-JavaFile([string]$Path, [string]$Content) {
  [System.IO.File]::WriteAllText($Path, $Content, $Utf8NoBom)
}

$ScriptRoot = Split-Path -Parent $MyInvocation.MyCommand.Path
$BackendRoot = Resolve-Path (Join-Path $ScriptRoot '..\..')
$BasePkg = 'com.marcohern.barez.ezclinic'
$EntityDir = Join-Path $BackendRoot 'src\main\java\com\marcohern\barez\ezclinic\entity'
$RepoDir   = Join-Path $BackendRoot 'src\main\java\com\marcohern\barez\ezclinic\repository'
New-Item -ItemType Directory -Force -Path $EntityDir | Out-Null
New-Item -ItemType Directory -Force -Path $RepoDir   | Out-Null

# Skip system / unsupported tables
$SkipTables = @('sysdiagrams')

# Tables with no PK -> map as @Immutable with synthetic all-non-nullable-column IdClass.
$NoPkTables = @{}

Add-Type -AssemblyName System.Data
$cs = "Server=$Server;Database=$Database;User Id=$User;Password=$Password;TrustServerCertificate=True;Connection Timeout=20;"
$conn = New-Object System.Data.SqlClient.SqlConnection $cs
$conn.Open()

function Invoke-Sql([string]$sql) {
  $cmd = $conn.CreateCommand()
  $cmd.CommandText = $sql
  $cmd.CommandTimeout = 60
  $r = $cmd.ExecuteReader()
  $rows = New-Object System.Collections.ArrayList
  while ($r.Read()) {
    $row = [ordered]@{}
    for ($i = 0; $i -lt $r.FieldCount; $i++) {
      $v = $r.GetValue($i)
      if ($v -is [System.DBNull]) { $v = $null }
      $row[$r.GetName($i)] = $v
    }
    [void]$rows.Add([pscustomobject]$row)
  }
  $r.Close()
  return ,$rows
}

function To-CamelCase([string]$name) {
  if ([string]::IsNullOrEmpty($name)) { return $name }
  $reserved = @('class','public','private','protected','static','final','abstract','synchronized',
                'volatile','transient','native','interface','enum','package','import','extends',
                'implements','new','this','super','null','true','false','void','int','long',
                'short','byte','boolean','float','double','char','if','else','for','while',
                'do','switch','case','default','break','continue','return','try','catch',
                'finally','throw','throws','instanceof','goto','const','strictfp')
  # Split on any non-identifier char, capitalize tokens, join (camelCase first lower).
  $tokens = @([regex]::Split($name, '[^A-Za-z0-9_]+') | Where-Object { $_ -ne '' })
  if ($tokens.Count -eq 0) { return '_' }
  $sb = New-Object System.Text.StringBuilder
  for ($i = 0; $i -lt $tokens.Count; $i++) {
    $tok = $tokens[$i]
    if ($i -eq 0) {
      [void]$sb.Append([char]::ToLowerInvariant($tok[0]))
      if ($tok.Length -gt 1) { [void]$sb.Append($tok.Substring(1)) }
    } else {
      [void]$sb.Append([char]::ToUpperInvariant($tok[0]))
      if ($tok.Length -gt 1) { [void]$sb.Append($tok.Substring(1)) }
    }
  }
  $r = $sb.ToString()
  if ($r -match '^[0-9]') { $r = "_$r" }
  if ($reserved -contains $r.ToLower()) { $r += '_' }
  return $r
}

function Map-Type([string]$sqlType, [bool]$nullable, [int]$precision, [int]$scale, [int]$maxLen) {
  switch ($sqlType.ToLower()) {
    'bigint'           { return 'Long' }
    'int'              { return 'Integer' }
    'smallint'         { return 'Short' }
    'tinyint'          { return 'Short' }
    'bit'              { return 'Boolean' }
    'decimal'          { return 'java.math.BigDecimal' }
    'numeric'          { return 'java.math.BigDecimal' }
    'money'            { return 'java.math.BigDecimal' }
    'smallmoney'       { return 'java.math.BigDecimal' }
    'float'            { return 'Double' }
    'real'             { return 'Float' }
    'datetime'         { return 'java.time.LocalDateTime' }
    'datetime2'        { return 'java.time.LocalDateTime' }
    'smalldatetime'    { return 'java.time.LocalDateTime' }
    'datetimeoffset'   { return 'java.time.OffsetDateTime' }
    'date'             { return 'java.time.LocalDate' }
    'time'             { return 'java.time.LocalTime' }
    'nvarchar'         { return 'String' }
    'varchar'          { return 'String' }
    'nchar'            { return 'String' }
    'char'             { return 'String' }
    'ntext'            { return 'String' }
    'text'             { return 'String' }
    'xml'              { return 'String' }
    'uniqueidentifier' { return 'java.util.UUID' }
    'varbinary'        { return 'byte[]' }
    'binary'           { return 'byte[]' }
    'image'            { return 'byte[]' }
    default            { return 'String' }
  }
}

Write-Host "Reading schema metadata..." -ForegroundColor Cyan

$tables = Invoke-Sql @"
SELECT TABLE_SCHEMA, TABLE_NAME
FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_TYPE='BASE TABLE'
ORDER BY TABLE_NAME
"@

$columns = Invoke-Sql @"
SELECT
  c.TABLE_NAME,
  c.COLUMN_NAME,
  c.ORDINAL_POSITION,
  c.IS_NULLABLE,
  c.DATA_TYPE,
  ISNULL(c.CHARACTER_MAXIMUM_LENGTH, 0) AS CHARACTER_MAXIMUM_LENGTH,
  ISNULL(c.NUMERIC_PRECISION, 0) AS NUMERIC_PRECISION,
  ISNULL(c.NUMERIC_SCALE, 0) AS NUMERIC_SCALE,
  COLUMNPROPERTY(OBJECT_ID(QUOTENAME(c.TABLE_SCHEMA)+'.'+QUOTENAME(c.TABLE_NAME)), c.COLUMN_NAME, 'IsIdentity') AS IS_IDENTITY
FROM INFORMATION_SCHEMA.COLUMNS c
ORDER BY c.TABLE_NAME, c.ORDINAL_POSITION
"@

$pkRows = Invoke-Sql @"
SELECT kcu.TABLE_NAME, kcu.COLUMN_NAME, kcu.ORDINAL_POSITION
FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS tc
JOIN INFORMATION_SCHEMA.KEY_COLUMN_USAGE kcu
  ON tc.CONSTRAINT_NAME = kcu.CONSTRAINT_NAME AND tc.TABLE_NAME = kcu.TABLE_NAME
WHERE tc.CONSTRAINT_TYPE = 'PRIMARY KEY'
ORDER BY kcu.TABLE_NAME, kcu.ORDINAL_POSITION
"@

# Group columns/PKs by table
$colsByTable = @{}
foreach ($c in $columns) {
  if (-not $colsByTable.ContainsKey($c.TABLE_NAME)) { $colsByTable[$c.TABLE_NAME] = New-Object System.Collections.ArrayList }
  [void]$colsByTable[$c.TABLE_NAME].Add($c)
}
$pksByTable = @{}
foreach ($p in $pkRows) {
  if (-not $pksByTable.ContainsKey($p.TABLE_NAME)) { $pksByTable[$p.TABLE_NAME] = New-Object System.Collections.ArrayList }
  [void]$pksByTable[$p.TABLE_NAME].Add($p.COLUMN_NAME)
}

$conn.Close()

Write-Host ("Found {0} tables. Generating..." -f $tables.Count) -ForegroundColor Cyan

$generated = 0
$idClasses = 0

# Clear out previously generated files (keep dir)
Get-ChildItem -Path $EntityDir -Filter '*.java' -ErrorAction SilentlyContinue | Remove-Item -Force
Get-ChildItem -Path $RepoDir   -Filter '*.java' -ErrorAction SilentlyContinue | Remove-Item -Force

foreach ($t in $tables) {
  $table = $t.TABLE_NAME
  if ($SkipTables -contains $table) { continue }

  $cols = $colsByTable[$table]
  if (-not $cols) { continue }

  $pkCols = @()
  if ($pksByTable.ContainsKey($table)) { $pkCols = @($pksByTable[$table]) }

  # No-PK tables: synthetic IdClass = all non-nullable columns; if none, fall back to all columns.
  $synthetic = $false
  if ($pkCols.Count -eq 0) {
    $synthetic = $true
    $candidate = @($cols | Where-Object { $_.IS_NULLABLE -eq 'NO' } | ForEach-Object { $_.COLUMN_NAME })
    if ($candidate.Count -eq 0) { $candidate = @($cols | ForEach-Object { $_.COLUMN_NAME }) }
    $pkCols = $candidate
  }

  $isComposite = ($pkCols.Count -gt 1) -or $synthetic

  # ---- Build entity ----
  $sb = New-Object System.Text.StringBuilder
  [void]$sb.AppendLine("package $BasePkg.entity;")
  [void]$sb.AppendLine()
  [void]$sb.AppendLine("import jakarta.persistence.*;")
  [void]$sb.AppendLine("import org.hibernate.annotations.Immutable;")
  [void]$sb.AppendLine()
  if ($synthetic) {
    [void]$sb.AppendLine("// NOTE: source table has no primary key. Synthetic IdClass composed of all non-nullable columns.")
    [void]$sb.AppendLine("// Rows containing NULLs across all candidate-id columns may be unfetchable via JPA.")
  }
  [void]$sb.AppendLine("@Entity")
  [void]$sb.AppendLine("@Immutable")
  [void]$sb.AppendLine("@Table(name = `"$table`")")
  if ($isComposite) {
    [void]$sb.AppendLine("@IdClass($table" + "Id.class)")
  }
  [void]$sb.AppendLine("public class $table {")
  [void]$sb.AppendLine()

  foreach ($c in $cols) {
    $colName = $c.COLUMN_NAME
    $field = To-CamelCase $colName
    $javaType = Map-Type $c.DATA_TYPE ($c.IS_NULLABLE -eq 'YES') ([int]$c.NUMERIC_PRECISION) ([int]$c.NUMERIC_SCALE) ([int]$c.CHARACTER_MAXIMUM_LENGTH)
    $nullable = ($c.IS_NULLABLE -eq 'YES')
    $isPk = $pkCols -contains $colName

    if ($isPk) {
      [void]$sb.AppendLine("    @Id")
      if (-not $isComposite -and $c.IS_IDENTITY -eq 1) {
        [void]$sb.AppendLine("    @GeneratedValue(strategy = GenerationType.IDENTITY)")
      }
    }
    $colAnno = "    @Column(name = `"$colName`""
    if (-not $nullable) { $colAnno += ", nullable = false" }
    if ($javaType -eq 'String' -and $c.CHARACTER_MAXIMUM_LENGTH -gt 0 -and $c.CHARACTER_MAXIMUM_LENGTH -lt 1073741823) {
      $colAnno += ", length = $($c.CHARACTER_MAXIMUM_LENGTH)"
    }
    $colAnno += ")"
    [void]$sb.AppendLine($colAnno)
    [void]$sb.AppendLine("    private $javaType $field;")
    [void]$sb.AppendLine()
  }

  # Getters only (read-only entity)
  foreach ($c in $cols) {
    $field = To-CamelCase $c.COLUMN_NAME
    $javaType = Map-Type $c.DATA_TYPE ($c.IS_NULLABLE -eq 'YES') ([int]$c.NUMERIC_PRECISION) ([int]$c.NUMERIC_SCALE) ([int]$c.CHARACTER_MAXIMUM_LENGTH)
    $cap = [char]::ToUpperInvariant($field[0]) + $(if ($field.Length -gt 1) { $field.Substring(1) } else { '' })
    [void]$sb.AppendLine("    public $javaType get$cap() { return $field; }")
  }

  [void]$sb.AppendLine("}")
  Write-JavaFile (Join-Path $EntityDir "$table.java") $sb.ToString()
  $generated++

  # ---- Composite Id class ----
  if ($isComposite) {
    $idName = "$table" + "Id"
    $idsb = New-Object System.Text.StringBuilder
    [void]$idsb.AppendLine("package $BasePkg.entity;")
    [void]$idsb.AppendLine()
    [void]$idsb.AppendLine("import java.io.Serializable;")
    [void]$idsb.AppendLine("import java.util.Objects;")
    [void]$idsb.AppendLine()
    [void]$idsb.AppendLine("public class $idName implements Serializable {")

    $idFields = @()
    foreach ($pkCol in $pkCols) {
      $col = $cols | Where-Object { $_.COLUMN_NAME -eq $pkCol } | Select-Object -First 1
      if (-not $col) { continue }
      $jt = Map-Type $col.DATA_TYPE ($col.IS_NULLABLE -eq 'YES') ([int]$col.NUMERIC_PRECISION) ([int]$col.NUMERIC_SCALE) ([int]$col.CHARACTER_MAXIMUM_LENGTH)
      $f = To-CamelCase $pkCol
      $idFields += [pscustomobject]@{ Type = $jt; Field = $f }
      [void]$idsb.AppendLine("    private $jt $f;")
    }
    [void]$idsb.AppendLine()
    [void]$idsb.AppendLine("    public $idName() {}")
    [void]$idsb.AppendLine()
    # equals/hashCode
    [void]$idsb.AppendLine("    @Override")
    [void]$idsb.AppendLine("    public boolean equals(Object o) {")
    [void]$idsb.AppendLine("        if (this == o) return true;")
    [void]$idsb.AppendLine("        if (!(o instanceof $idName that)) return false;")
    $eqExprs = ($idFields | ForEach-Object { "Objects.equals($($_.Field), that.$($_.Field))" }) -join ' && '
    if (-not $eqExprs) { $eqExprs = 'true' }
    [void]$idsb.AppendLine("        return $eqExprs;")
    [void]$idsb.AppendLine("    }")
    [void]$idsb.AppendLine()
    [void]$idsb.AppendLine("    @Override")
    $hashArgs = ($idFields | ForEach-Object { $_.Field }) -join ', '
    if (-not $hashArgs) { $hashArgs = '' }
    [void]$idsb.AppendLine("    public int hashCode() { return Objects.hash($hashArgs); }")
    [void]$idsb.AppendLine("}")
    Write-JavaFile (Join-Path $EntityDir "$idName.java") $idsb.ToString()
    $idClasses++
  }

  # ---- Repository ----
  $idType = if ($isComposite) { "$table" + "Id" } else {
    $pkCol = $pkCols[0]
    $pkColInfo = $cols | Where-Object { $_.COLUMN_NAME -eq $pkCol } | Select-Object -First 1
    Map-Type $pkColInfo.DATA_TYPE ($pkColInfo.IS_NULLABLE -eq 'YES') ([int]$pkColInfo.NUMERIC_PRECISION) ([int]$pkColInfo.NUMERIC_SCALE) ([int]$pkColInfo.CHARACTER_MAXIMUM_LENGTH)
  }

  $rsb = New-Object System.Text.StringBuilder
  [void]$rsb.AppendLine("package $BasePkg.repository;")
  [void]$rsb.AppendLine()
  [void]$rsb.AppendLine("import $BasePkg.entity.$table;")
  if ($isComposite) { [void]$rsb.AppendLine("import $BasePkg.entity.$($table)Id;") }
  [void]$rsb.AppendLine("import org.springframework.data.domain.Page;")
  [void]$rsb.AppendLine("import org.springframework.data.domain.Pageable;")
  [void]$rsb.AppendLine("import org.springframework.data.repository.Repository;")
  [void]$rsb.AppendLine()
  [void]$rsb.AppendLine("import java.util.List;")
  [void]$rsb.AppendLine("import java.util.Optional;")
  [void]$rsb.AppendLine()
  [void]$rsb.AppendLine("public interface ${table}Repository extends Repository<$table, $idType> {")
  [void]$rsb.AppendLine("    Optional<$table> findById($idType id);")
  [void]$rsb.AppendLine("    List<$table> findAll();")
  [void]$rsb.AppendLine("    Page<$table> findAll(Pageable pageable);")
  [void]$rsb.AppendLine("    long count();")
  [void]$rsb.AppendLine("    boolean existsById($idType id);")
  [void]$rsb.AppendLine("}")
  Write-JavaFile (Join-Path $RepoDir "${table}Repository.java") $rsb.ToString()
}

Write-Host ("Done. Wrote {0} entity files (incl. {1} IdClasses) and {0} repositories." -f $generated, $idClasses) -ForegroundColor Green
