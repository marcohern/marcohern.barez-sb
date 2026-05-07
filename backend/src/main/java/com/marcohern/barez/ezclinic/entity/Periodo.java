package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Periodo")
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPeriodo", nullable = false)
    private Integer idPeriodo;

    @Column(name = "PeriodoPago", length = 50)
    private String periodoPago;

    public Integer getIdPeriodo() { return idPeriodo; }
    public String getPeriodoPago() { return periodoPago; }
}
