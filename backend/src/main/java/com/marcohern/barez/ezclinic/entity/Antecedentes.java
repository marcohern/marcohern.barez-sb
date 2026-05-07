package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Antecedentes")
public class Antecedentes {

    @Id
    @Column(name = "IdPaciente", nullable = false)
    private Integer idPaciente;

    @Column(name = "RH", length = 5)
    private String rH;

    @Column(name = "Alergias")
    private String alergias;

    @Column(name = "AlertaMedica")
    private String alertaMedica;

    @Column(name = "Patologicos")
    private String patologicos;

    @Column(name = "Quirurgicos")
    private String quirurgicos;

    @Column(name = "Traumaticos")
    private String traumaticos;

    @Column(name = "Toxicos")
    private String toxicos;

    @Column(name = "Hematologicos")
    private String hematologicos;

    @Column(name = "Ginecoobstetricos")
    private String ginecoobstetricos;

    @Column(name = "Estomatologicos")
    private String estomatologicos;

    @Column(name = "Familiares")
    private String familiares;

    @Column(name = "Farmacologicos")
    private String farmacologicos;

    @Column(name = "Vacunacion")
    private String vacunacion;

    @Column(name = "Otros")
    private String otros;

    @Column(name = "Drogadiccion")
    private Short drogadiccion;

    @Column(name = "FrecuenciaAlcohol")
    private Short frecuenciaAlcohol;

    @Column(name = "IntensidadAlcohol")
    private Short intensidadAlcohol;

    @Column(name = "FechaDesdeAlcohol")
    private java.time.LocalDateTime fechaDesdeAlcohol;

    @Column(name = "FechaHastaAlcohol")
    private java.time.LocalDateTime fechaHastaAlcohol;

    @Column(name = "FrecuenciaTabaco")
    private Short frecuenciaTabaco;

    @Column(name = "IntensidadTabaco")
    private Short intensidadTabaco;

    @Column(name = "FechaDesdeTabaco")
    private java.time.LocalDateTime fechaDesdeTabaco;

    @Column(name = "FechaHastaTabaco")
    private java.time.LocalDateTime fechaHastaTabaco;

    @Column(name = "FrecuenciaDrogas")
    private Short frecuenciaDrogas;

    @Column(name = "IntensidadDrogas")
    private Short intensidadDrogas;

    @Column(name = "FechaDesdeDrogas")
    private java.time.LocalDateTime fechaDesdeDrogas;

    @Column(name = "FechaHastaDrogas")
    private java.time.LocalDateTime fechaHastaDrogas;

    @Column(name = "Alcoholismo")
    private Short alcoholismo;

    @Column(name = "Tabaquismo")
    private Short tabaquismo;

    public Integer getIdPaciente() { return idPaciente; }
    public String getRH() { return rH; }
    public String getAlergias() { return alergias; }
    public String getAlertaMedica() { return alertaMedica; }
    public String getPatologicos() { return patologicos; }
    public String getQuirurgicos() { return quirurgicos; }
    public String getTraumaticos() { return traumaticos; }
    public String getToxicos() { return toxicos; }
    public String getHematologicos() { return hematologicos; }
    public String getGinecoobstetricos() { return ginecoobstetricos; }
    public String getEstomatologicos() { return estomatologicos; }
    public String getFamiliares() { return familiares; }
    public String getFarmacologicos() { return farmacologicos; }
    public String getVacunacion() { return vacunacion; }
    public String getOtros() { return otros; }
    public Short getDrogadiccion() { return drogadiccion; }
    public Short getFrecuenciaAlcohol() { return frecuenciaAlcohol; }
    public Short getIntensidadAlcohol() { return intensidadAlcohol; }
    public java.time.LocalDateTime getFechaDesdeAlcohol() { return fechaDesdeAlcohol; }
    public java.time.LocalDateTime getFechaHastaAlcohol() { return fechaHastaAlcohol; }
    public Short getFrecuenciaTabaco() { return frecuenciaTabaco; }
    public Short getIntensidadTabaco() { return intensidadTabaco; }
    public java.time.LocalDateTime getFechaDesdeTabaco() { return fechaDesdeTabaco; }
    public java.time.LocalDateTime getFechaHastaTabaco() { return fechaHastaTabaco; }
    public Short getFrecuenciaDrogas() { return frecuenciaDrogas; }
    public Short getIntensidadDrogas() { return intensidadDrogas; }
    public java.time.LocalDateTime getFechaDesdeDrogas() { return fechaDesdeDrogas; }
    public java.time.LocalDateTime getFechaHastaDrogas() { return fechaHastaDrogas; }
    public Short getAlcoholismo() { return alcoholismo; }
    public Short getTabaquismo() { return tabaquismo; }
}
