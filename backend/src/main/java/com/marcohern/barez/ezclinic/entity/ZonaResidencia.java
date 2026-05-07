package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ZonaResidencia")
public class ZonaResidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdZonaResidencia", nullable = false)
    private Integer idZonaResidencia;

    @Column(name = "ZonaResidencia", length = 15)
    private String zonaResidencia;

    @Column(name = "ValorZona", length = 1)
    private String valorZona;

    public Integer getIdZonaResidencia() { return idZonaResidencia; }
    public String getZonaResidencia() { return zonaResidencia; }
    public String getValorZona() { return valorZona; }
}
