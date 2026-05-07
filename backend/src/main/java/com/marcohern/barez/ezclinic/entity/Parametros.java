package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Parametros")
public class Parametros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdParametro", nullable = false)
    private Integer idParametro;

    @Column(name = "Parametro", nullable = false, length = 255)
    private String parametro;

    public Integer getIdParametro() { return idParametro; }
    public String getParametro() { return parametro; }
}
