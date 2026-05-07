package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "HConsulta")
public class HConsulta {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "IdTipoConsulta")
    private Integer idTipoConsulta;

    @Column(name = "TensionArterial", length = 255)
    private String tensionArterial;

    @Column(name = "FrecuenciaCardiaca", length = 255)
    private String frecuenciaCardiaca;

    @Column(name = "FrecuenciaRespiratoria", length = 255)
    private String frecuenciaRespiratoria;

    @Column(name = "Peso")
    private Float peso;

    @Column(name = "Talla")
    private Float talla;

    @Column(name = "Temperatura")
    private Float temperatura;

    @Column(name = "ExamenFisico")
    private String examenFisico;

    @Column(name = "IdCausaExterna")
    private Integer idCausaExterna;

    @Column(name = "IdTipoDiagnostico")
    private Integer idTipoDiagnostico;

    @Column(name = "DiasIncapacidad")
    private Short diasIncapacidad;

    @Column(name = "IdFinalidad")
    private Integer idFinalidad;

    @Column(name = "IdMotivoConsulta")
    private Integer idMotivoConsulta;

    @Column(name = "GrasaCorporal")
    private Float grasaCorporal;

    @Column(name = "GrasaTotal")
    private Float grasaTotal;

    @Column(name = "IdMotivoExamen")
    private Integer idMotivoExamen;

    @Column(name = "IdCalificacion")
    private Integer idCalificacion;

    @Column(name = "PruebasParaClinicas")
    private String pruebasParaClinicas;

    @Column(name = "RecomendacionEvaluacion")
    private String recomendacionEvaluacion;

    @Column(name = "RecomendacionLaboral")
    private String recomendacionLaboral;

    @Column(name = "EpidemiologiaVisual")
    private Boolean epidemiologiaVisual;

    @Column(name = "EpidemiologiaAuditivo")
    private Boolean epidemiologiaAuditivo;

    @Column(name = "EpidemiologiaErgonomico")
    private Boolean epidemiologiaErgonomico;

    @Column(name = "EpidemiologiaPsicolaboral")
    private Boolean epidemiologiaPsicolaboral;

    @Column(name = "EpidemiologiaOtro")
    private String epidemiologiaOtro;

    @Column(name = "IdModalidadAtencion")
    private Integer idModalidadAtencion;

    @Column(name = "AplicaIncapacidad")
    private Boolean aplicaIncapacidad;

    @Column(name = "EsIncapacidadExterna")
    private Boolean esIncapacidadExterna;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdTipoConsulta() { return idTipoConsulta; }
    public String getTensionArterial() { return tensionArterial; }
    public String getFrecuenciaCardiaca() { return frecuenciaCardiaca; }
    public String getFrecuenciaRespiratoria() { return frecuenciaRespiratoria; }
    public Float getPeso() { return peso; }
    public Float getTalla() { return talla; }
    public Float getTemperatura() { return temperatura; }
    public String getExamenFisico() { return examenFisico; }
    public Integer getIdCausaExterna() { return idCausaExterna; }
    public Integer getIdTipoDiagnostico() { return idTipoDiagnostico; }
    public Short getDiasIncapacidad() { return diasIncapacidad; }
    public Integer getIdFinalidad() { return idFinalidad; }
    public Integer getIdMotivoConsulta() { return idMotivoConsulta; }
    public Float getGrasaCorporal() { return grasaCorporal; }
    public Float getGrasaTotal() { return grasaTotal; }
    public Integer getIdMotivoExamen() { return idMotivoExamen; }
    public Integer getIdCalificacion() { return idCalificacion; }
    public String getPruebasParaClinicas() { return pruebasParaClinicas; }
    public String getRecomendacionEvaluacion() { return recomendacionEvaluacion; }
    public String getRecomendacionLaboral() { return recomendacionLaboral; }
    public Boolean getEpidemiologiaVisual() { return epidemiologiaVisual; }
    public Boolean getEpidemiologiaAuditivo() { return epidemiologiaAuditivo; }
    public Boolean getEpidemiologiaErgonomico() { return epidemiologiaErgonomico; }
    public Boolean getEpidemiologiaPsicolaboral() { return epidemiologiaPsicolaboral; }
    public String getEpidemiologiaOtro() { return epidemiologiaOtro; }
    public Integer getIdModalidadAtencion() { return idModalidadAtencion; }
    public Boolean getAplicaIncapacidad() { return aplicaIncapacidad; }
    public Boolean getEsIncapacidadExterna() { return esIncapacidadExterna; }
}
