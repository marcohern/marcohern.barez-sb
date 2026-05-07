package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "IdEspecialidad")
    private Integer idEspecialidad;

    @Column(name = "ValorRia", length = 8)
    private String valorRia;

    @Column(name = "IdServicioControl")
    private Integer idServicioControl;

    @Column(name = "TiempoServicio")
    private java.time.LocalDateTime tiempoServicio;

    @Column(name = "ServicioSuspendido", nullable = false)
    private Boolean servicioSuspendido;

    @Column(name = "IdClasificacion")
    private Integer idClasificacion;

    @Column(name = "GastosAdicionales", nullable = false)
    private Boolean gastosAdicionales;

    @Column(name = "ProgramableRecepcion", nullable = false)
    private Boolean programableRecepcion;

    @Column(name = "RequiereControl", nullable = false)
    private Boolean requiereControl;

    @Column(name = "ProgramarPorRecurso", nullable = false)
    private Boolean programarPorRecurso;

    @Column(name = "Notas")
    private String notas;

    @Column(name = "RequiereEpicrisis", nullable = false)
    private Boolean requiereEpicrisis;

    @Column(name = "IdServicioRIPS", length = 8)
    private String idServicioRIPS;

    @Column(name = "NoReportarRIPS", nullable = false)
    private Boolean noReportarRIPS;

    @Column(name = "Alias", length = 255)
    private String alias;

    @Column(name = "NoMostrarParaclinico", nullable = false)
    private Boolean noMostrarParaclinico;

    @Column(name = "AliasParaclinico", length = 510)
    private String aliasParaclinico;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
    public String getValorRia() { return valorRia; }
    public Integer getIdServicioControl() { return idServicioControl; }
    public java.time.LocalDateTime getTiempoServicio() { return tiempoServicio; }
    public Boolean getServicioSuspendido() { return servicioSuspendido; }
    public Integer getIdClasificacion() { return idClasificacion; }
    public Boolean getGastosAdicionales() { return gastosAdicionales; }
    public Boolean getProgramableRecepcion() { return programableRecepcion; }
    public Boolean getRequiereControl() { return requiereControl; }
    public Boolean getProgramarPorRecurso() { return programarPorRecurso; }
    public String getNotas() { return notas; }
    public Boolean getRequiereEpicrisis() { return requiereEpicrisis; }
    public String getIdServicioRIPS() { return idServicioRIPS; }
    public Boolean getNoReportarRIPS() { return noReportarRIPS; }
    public String getAlias() { return alias; }
    public Boolean getNoMostrarParaclinico() { return noMostrarParaclinico; }
    public String getAliasParaclinico() { return aliasParaclinico; }
}
