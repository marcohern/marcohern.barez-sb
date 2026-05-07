package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Cobertura")
public class Cobertura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCobertura", nullable = false)
    private Short idCobertura;

    @Column(name = "Codigo", nullable = false, length = 2)
    private String codigo;

    @Column(name = "Cobertura", nullable = false, length = 100)
    private String cobertura;

    public Short getIdCobertura() { return idCobertura; }
    public String getCodigo() { return codigo; }
    public String getCobertura() { return cobertura; }
}
