package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Complicaciones")
public class Complicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdComplicacion", nullable = false)
    private Integer idComplicacion;

    @Column(name = "Complicacion")
    private String complicacion;

    public Integer getIdComplicacion() { return idComplicacion; }
    public String getComplicacion() { return complicacion; }
}
