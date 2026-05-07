package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Indicaciones")
public class Indicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdIndicacion", nullable = false)
    private Integer idIndicacion;

    @Column(name = "Indicacion")
    private String indicacion;

    public Integer getIdIndicacion() { return idIndicacion; }
    public String getIndicacion() { return indicacion; }
}
