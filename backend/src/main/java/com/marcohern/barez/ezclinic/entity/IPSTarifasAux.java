package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "IPSTarifasAux")
public class IPSTarifasAux {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "IdTarifaMedicos")
    private Integer idTarifaMedicos;

    @Column(name = "HonoMedicos")
    private java.math.BigDecimal honoMedicos;

    @Column(name = "IdTarifaAnest")
    private Integer idTarifaAnest;

    @Column(name = "HonoAnest")
    private java.math.BigDecimal honoAnest;

    @Column(name = "IdTarifaAyudantia")
    private Integer idTarifaAyudantia;

    @Column(name = "HonoAyudantia")
    private java.math.BigDecimal honoAyudantia;

    @Column(name = "IdTarifaSala")
    private Integer idTarifaSala;

    @Column(name = "HonoSala")
    private java.math.BigDecimal honoSala;

    @Column(name = "IdTarifaMateriales")
    private Integer idTarifaMateriales;

    @Column(name = "HonoMateriales")
    private java.math.BigDecimal honoMateriales;

    @Column(name = "IdTarifaOtros")
    private Integer idTarifaOtros;

    @Column(name = "HonoOtros")
    private java.math.BigDecimal honoOtros;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdTarifaMedicos() { return idTarifaMedicos; }
    public java.math.BigDecimal getHonoMedicos() { return honoMedicos; }
    public Integer getIdTarifaAnest() { return idTarifaAnest; }
    public java.math.BigDecimal getHonoAnest() { return honoAnest; }
    public Integer getIdTarifaAyudantia() { return idTarifaAyudantia; }
    public java.math.BigDecimal getHonoAyudantia() { return honoAyudantia; }
    public Integer getIdTarifaSala() { return idTarifaSala; }
    public java.math.BigDecimal getHonoSala() { return honoSala; }
    public Integer getIdTarifaMateriales() { return idTarifaMateriales; }
    public java.math.BigDecimal getHonoMateriales() { return honoMateriales; }
    public Integer getIdTarifaOtros() { return idTarifaOtros; }
    public java.math.BigDecimal getHonoOtros() { return honoOtros; }
}
