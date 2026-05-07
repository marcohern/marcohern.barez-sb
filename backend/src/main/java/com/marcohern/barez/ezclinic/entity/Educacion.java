package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Educacion")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEducacion", nullable = false)
    private Integer idEducacion;

    @Column(name = "Educacion", length = 100)
    private String educacion;

    public Integer getIdEducacion() { return idEducacion; }
    public String getEducacion() { return educacion; }
}
