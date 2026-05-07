package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FinalidadConsulta")
public class FinalidadConsulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFinalidad", nullable = false)
    private Integer idFinalidad;

    @Column(name = "FinalidadConsulta", length = 80)
    private String finalidadConsulta;

    @Column(name = "Descripción")
    private String descripciN;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "TiempoMin")
    private Float tiempoMin;

    @Column(name = "TiempoMax")
    private Float tiempoMax;

    @Column(name = "Codigo", length = 2)
    private String codigo;

    public Integer getIdFinalidad() { return idFinalidad; }
    public String getFinalidadConsulta() { return finalidadConsulta; }
    public String getDescripciN() { return descripciN; }
    public Integer getIdSexo() { return idSexo; }
    public Float getTiempoMin() { return tiempoMin; }
    public Float getTiempoMax() { return tiempoMax; }
    public String getCodigo() { return codigo; }
}
