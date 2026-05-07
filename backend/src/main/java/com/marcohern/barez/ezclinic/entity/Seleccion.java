package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Seleccion")
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSeleccion", nullable = false)
    private Integer idSeleccion;

    @Column(name = "Seleccion", length = 255)
    private String seleccion;

    public Integer getIdSeleccion() { return idSeleccion; }
    public String getSeleccion() { return seleccion; }
}
