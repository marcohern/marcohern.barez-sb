package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Ocupaciones")
public class Ocupaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOcupacion", nullable = false)
    private Integer idOcupacion;

    @Column(name = "Ocupacion", length = 255)
    private String ocupacion;

    @Column(name = "ValRia", length = 3)
    private String valRia;

    public Integer getIdOcupacion() { return idOcupacion; }
    public String getOcupacion() { return ocupacion; }
    public String getValRia() { return valRia; }
}
