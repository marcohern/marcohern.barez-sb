package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Infecciones")
public class Infecciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdInfeccion", nullable = false)
    private Integer idInfeccion;

    @Column(name = "Infeccion")
    private String infeccion;

    public Integer getIdInfeccion() { return idInfeccion; }
    public String getInfeccion() { return infeccion; }
}
