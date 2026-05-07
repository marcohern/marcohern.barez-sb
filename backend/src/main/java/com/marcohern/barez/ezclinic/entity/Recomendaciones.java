package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Recomendaciones")
public class Recomendaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRecomendacion", nullable = false)
    private Integer idRecomendacion;

    @Column(name = "Recomendacion")
    private String recomendacion;

    public Integer getIdRecomendacion() { return idRecomendacion; }
    public String getRecomendacion() { return recomendacion; }
}
