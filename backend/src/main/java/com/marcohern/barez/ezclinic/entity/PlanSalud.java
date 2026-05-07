package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "PlanSalud")
public class PlanSalud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPlanSalud", nullable = false)
    private Integer idPlanSalud;

    @Column(name = "IdTipoPlan", nullable = false)
    private Integer idTipoPlan;

    @Column(name = "IdTipoUsuario", nullable = false)
    private Integer idTipoUsuario;

    @Column(name = "IdEPS", nullable = false)
    private Integer idEPS;

    @Column(name = "IdPrograma", nullable = false)
    private Integer idPrograma;

    @Column(name = "IdTipoAfiliado", nullable = false)
    private Integer idTipoAfiliado;

    @Column(name = "VigenciaConvenio", length = 3)
    private String vigenciaConvenio;

    @Column(name = "FechaConvenio")
    private java.time.LocalDateTime fechaConvenio;

    @Column(name = "NumContrato", length = 15)
    private String numContrato;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Requisitos")
    private String requisitos;

    @Column(name = "AutorizacionRemota", nullable = false)
    private Boolean autorizacionRemota;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "ProgramaSuspendido", nullable = false)
    private Boolean programaSuspendido;

    @Column(name = "CorreoElectronico", length = 255)
    private String correoElectronico;

    @Column(name = "IdCobertura", nullable = false)
    private Short idCobertura;

    public Integer getIdPlanSalud() { return idPlanSalud; }
    public Integer getIdTipoPlan() { return idTipoPlan; }
    public Integer getIdTipoUsuario() { return idTipoUsuario; }
    public Integer getIdEPS() { return idEPS; }
    public Integer getIdPrograma() { return idPrograma; }
    public Integer getIdTipoAfiliado() { return idTipoAfiliado; }
    public String getVigenciaConvenio() { return vigenciaConvenio; }
    public java.time.LocalDateTime getFechaConvenio() { return fechaConvenio; }
    public String getNumContrato() { return numContrato; }
    public String getDescripcion() { return descripcion; }
    public String getRequisitos() { return requisitos; }
    public Boolean getAutorizacionRemota() { return autorizacionRemota; }
    public String getObservaciones() { return observaciones; }
    public Boolean getProgramaSuspendido() { return programaSuspendido; }
    public String getCorreoElectronico() { return correoElectronico; }
    public Short getIdCobertura() { return idCobertura; }
}
