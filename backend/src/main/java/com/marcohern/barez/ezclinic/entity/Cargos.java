package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Cargos")
public class Cargos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCargo", nullable = false)
    private Integer idCargo;

    @Column(name = "Cargo", length = 100)
    private String cargo;

    public Integer getIdCargo() { return idCargo; }
    public String getCargo() { return cargo; }
}
