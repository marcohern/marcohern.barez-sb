package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoPregunta")
public class TipoPregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoPregunta", nullable = false)
    private Integer idTipoPregunta;

    @Column(name = "TipoPregunta", nullable = false, length = 50)
    private String tipoPregunta;

    public Integer getIdTipoPregunta() { return idTipoPregunta; }
    public String getTipoPregunta() { return tipoPregunta; }
}
