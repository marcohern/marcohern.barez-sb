package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CIE10")
public class CIE10 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDiagnostico", nullable = false)
    private Integer idDiagnostico;

    @Column(name = "RiaDiagnostico", nullable = false, length = 4)
    private String riaDiagnostico;

    @Column(name = "Diagnostico", length = 255)
    private String diagnostico;

    @Column(name = "Obligatorio", nullable = false)
    private Boolean obligatorio;

    @Column(name = "IdTablaCIE", nullable = false)
    private Integer idTablaCIE;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "TiempoMin")
    private Float tiempoMin;

    @Column(name = "TiempoMax")
    private Float tiempoMax;

    @Column(name = "EsSecundario")
    private Boolean esSecundario;

    @Column(name = "Clase", length = 3)
    private String clase;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdDiagnostico() { return idDiagnostico; }
    public String getRiaDiagnostico() { return riaDiagnostico; }
    public String getDiagnostico() { return diagnostico; }
    public Boolean getObligatorio() { return obligatorio; }
    public Integer getIdTablaCIE() { return idTablaCIE; }
    public Integer getIdSexo() { return idSexo; }
    public Float getTiempoMin() { return tiempoMin; }
    public Float getTiempoMax() { return tiempoMax; }
    public Boolean getEsSecundario() { return esSecundario; }
    public String getClase() { return clase; }
    public Boolean getSuspendido() { return suspendido; }
}
