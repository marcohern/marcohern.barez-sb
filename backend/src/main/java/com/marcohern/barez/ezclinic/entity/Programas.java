package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Programas")
public class Programas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPrograma", nullable = false)
    private Integer idPrograma;

    @Column(name = "Programa", nullable = false, length = 50)
    private String programa;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdPrograma() { return idPrograma; }
    public String getPrograma() { return programa; }
    public String getDescripcion() { return descripcion; }
}
