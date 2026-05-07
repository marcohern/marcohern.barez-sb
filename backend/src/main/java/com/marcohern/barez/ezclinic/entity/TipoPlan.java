package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoPlan")
public class TipoPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoPlan", nullable = false)
    private Integer idTipoPlan;

    @Column(name = "TipoPlan", length = 100)
    private String tipoPlan;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdTipoPlan() { return idTipoPlan; }
    public String getTipoPlan() { return tipoPlan; }
    public String getDescripcion() { return descripcion; }
}
