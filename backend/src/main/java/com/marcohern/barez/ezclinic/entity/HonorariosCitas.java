package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "HonorariosCitas")
public class HonorariosCitas {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "HonoMedico")
    private java.math.BigDecimal honoMedico;

    @Column(name = "HonoAnest")
    private java.math.BigDecimal honoAnest;

    @Column(name = "HonoAyudantia")
    private java.math.BigDecimal honoAyudantia;

    @Column(name = "HonoSala")
    private java.math.BigDecimal honoSala;

    @Column(name = "HonoMateriales")
    private java.math.BigDecimal honoMateriales;

    @Column(name = "HonoOtros")
    private java.math.BigDecimal honoOtros;

    public Integer getIdAuto() { return idAuto; }
    public java.math.BigDecimal getHonoMedico() { return honoMedico; }
    public java.math.BigDecimal getHonoAnest() { return honoAnest; }
    public java.math.BigDecimal getHonoAyudantia() { return honoAyudantia; }
    public java.math.BigDecimal getHonoSala() { return honoSala; }
    public java.math.BigDecimal getHonoMateriales() { return honoMateriales; }
    public java.math.BigDecimal getHonoOtros() { return honoOtros; }
}
