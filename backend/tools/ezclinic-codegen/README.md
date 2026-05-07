# EZCLINICME codegen

Generates the read-only `com.marcohern.barez.ezclinic.{entity,repository}` Java sources by introspecting the EZCLINICME SQL Server schema.

## Run

```powershell
pwsh ./Generate-EzClinic.ps1
```

Optional env vars: `EZCLINIC_HOST`, `EZCLINIC_DB`, `EZCLINIC_USER`, `EZCLINIC_PWD`.

## Output

- `backend/src/main/java/com/marcohern/barez/ezclinic/entity/<Table>.java` — one `@Entity @Immutable` class per base table.
- `backend/src/main/java/com/marcohern/barez/ezclinic/entity/<Table>Id.java` — composite-key `@IdClass` (composite-PK tables only).
- `backend/src/main/java/com/marcohern/barez/ezclinic/repository/<Table>Repository.java` — `Repository<T, ID>` (read-only: no `save`/`delete`).

The generator clears those two directories on each run before writing — re-run after schema changes.

## Limitations (v1)

- No JPA associations: foreign keys are emitted as scalar columns only.
- 3 PK-less tables (`Ref_PyD`, `DisponibilidadMedicos`, `DisponibilidadRecursos`) get a synthetic `@IdClass` of all non-nullable columns; rows with NULLs in those columns will be unfetchable via JPA.
- `image` / `varbinary(max)` columns map to `byte[]` and are eagerly loaded — use projections for bulk reads.
- Credentials are inline in `application.properties`; move to env vars / Vault before production.
