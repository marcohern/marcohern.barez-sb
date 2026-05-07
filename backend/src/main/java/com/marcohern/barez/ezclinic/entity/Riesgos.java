package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Riesgos")
public class Riesgos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRiesgo", nullable = false)
    private Integer idRiesgo;

    @Column(name = "Riesgo", length = 100)
    private String riesgo;

    public Integer getIdRiesgo() { return idRiesgo; }
    public String getRiesgo() { return riesgo; }
}
