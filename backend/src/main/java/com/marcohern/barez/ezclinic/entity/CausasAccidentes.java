package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CausasAccidentes")
public class CausasAccidentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCausa", nullable = false)
    private Integer idCausa;

    @Column(name = "Causa", length = 100)
    private String causa;

    public Integer getIdCausa() { return idCausa; }
    public String getCausa() { return causa; }
}
