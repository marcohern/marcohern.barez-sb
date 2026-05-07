package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoDato")
public class TipoDato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoDato", nullable = false)
    private Integer idTipoDato;

    @Column(name = "TipoDato", length = 50)
    private String tipoDato;

    public Integer getIdTipoDato() { return idTipoDato; }
    public String getTipoDato() { return tipoDato; }
}
