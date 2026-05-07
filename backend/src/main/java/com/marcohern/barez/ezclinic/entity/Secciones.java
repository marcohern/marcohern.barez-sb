package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Secciones")
public class Secciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSeccion", nullable = false)
    private Integer idSeccion;

    @Column(name = "Seccion", length = 1000)
    private String seccion;

    public Integer getIdSeccion() { return idSeccion; }
    public String getSeccion() { return seccion; }
}
