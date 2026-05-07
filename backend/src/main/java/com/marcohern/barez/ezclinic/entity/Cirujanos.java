package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Cirujanos")
public class Cirujanos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCirujano", nullable = false)
    private Integer idCirujano;

    @Column(name = "Cirujano", length = 100)
    private String cirujano;

    public Integer getIdCirujano() { return idCirujano; }
    public String getCirujano() { return cirujano; }
}
