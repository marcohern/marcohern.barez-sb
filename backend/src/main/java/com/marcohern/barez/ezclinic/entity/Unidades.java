package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Unidades")
public class Unidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUnidad", nullable = false)
    private Integer idUnidad;

    @Column(name = "Unidad", length = 50)
    private String unidad;

    public Integer getIdUnidad() { return idUnidad; }
    public String getUnidad() { return unidad; }
}
