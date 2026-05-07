package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Recursos")
public class Recursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRecurso", nullable = false)
    private Integer idRecurso;

    @Column(name = "IdDependencia")
    private Integer idDependencia;

    @Column(name = "IdProveedor")
    private Integer idProveedor;

    @Column(name = "IdClasificacionRecurso")
    private Integer idClasificacionRecurso;

    @Column(name = "IdModalidad")
    private Integer idModalidad;

    @Column(name = "IdPeriodo")
    private Integer idPeriodo;

    @Column(name = "NombreRecurso", length = 100)
    private String nombreRecurso;

    @Column(name = "NumeroGrupo")
    private Integer numeroGrupo;

    @Column(name = "Fabricante", length = 50)
    private String fabricante;

    @Column(name = "NumeroSerie", length = 50)
    private String numeroSerie;

    @Column(name = "FechaFabricacion")
    private java.time.LocalDateTime fechaFabricacion;

    @Column(name = "Arriendo")
    private java.math.BigDecimal arriendo;

    @Column(name = "IdMedico")
    private Integer idMedico;

    @Column(name = "FechaAdquisicion")
    private java.time.LocalDateTime fechaAdquisicion;

    @Column(name = "TiempoGarantia", length = 50)
    private String tiempoGarantia;

    @Column(name = "TiempoEntreMantenimientos", length = 50)
    private String tiempoEntreMantenimientos;

    @Column(name = "FechaUltimoMantenimiento")
    private java.time.LocalDateTime fechaUltimoMantenimiento;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "CostoAdquisicion")
    private java.math.BigDecimal costoAdquisicion;

    @Column(name = "DepreciacionAnual")
    private java.math.BigDecimal depreciacionAnual;

    @Column(name = "TiempoVidaUtil", length = 50)
    private String tiempoVidaUtil;

    @Column(name = "TiempoUltimaCita", length = 50)
    private String tiempoUltimaCita;

    @Column(name = "RecursoSuspendido", nullable = false)
    private Boolean recursoSuspendido;

    @Column(name = "CabezaGrupo", nullable = false)
    private Boolean cabezaGrupo;

    @Column(name = "MostrarEnConsultorio", nullable = false)
    private Boolean mostrarEnConsultorio;

    public Integer getIdRecurso() { return idRecurso; }
    public Integer getIdDependencia() { return idDependencia; }
    public Integer getIdProveedor() { return idProveedor; }
    public Integer getIdClasificacionRecurso() { return idClasificacionRecurso; }
    public Integer getIdModalidad() { return idModalidad; }
    public Integer getIdPeriodo() { return idPeriodo; }
    public String getNombreRecurso() { return nombreRecurso; }
    public Integer getNumeroGrupo() { return numeroGrupo; }
    public String getFabricante() { return fabricante; }
    public String getNumeroSerie() { return numeroSerie; }
    public java.time.LocalDateTime getFechaFabricacion() { return fechaFabricacion; }
    public java.math.BigDecimal getArriendo() { return arriendo; }
    public Integer getIdMedico() { return idMedico; }
    public java.time.LocalDateTime getFechaAdquisicion() { return fechaAdquisicion; }
    public String getTiempoGarantia() { return tiempoGarantia; }
    public String getTiempoEntreMantenimientos() { return tiempoEntreMantenimientos; }
    public java.time.LocalDateTime getFechaUltimoMantenimiento() { return fechaUltimoMantenimiento; }
    public String getDescripcion() { return descripcion; }
    public java.math.BigDecimal getCostoAdquisicion() { return costoAdquisicion; }
    public java.math.BigDecimal getDepreciacionAnual() { return depreciacionAnual; }
    public String getTiempoVidaUtil() { return tiempoVidaUtil; }
    public String getTiempoUltimaCita() { return tiempoUltimaCita; }
    public Boolean getRecursoSuspendido() { return recursoSuspendido; }
    public Boolean getCabezaGrupo() { return cabezaGrupo; }
    public Boolean getMostrarEnConsultorio() { return mostrarEnConsultorio; }
}
