package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Vigencias")
public class Vigencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVigencia", nullable = false)
    private Integer idVigencia;

    @Column(name = "Vigencia", length = 255)
    private String vigencia;

    public Integer getIdVigencia() { return idVigencia; }
    public String getVigencia() { return vigencia; }
}
