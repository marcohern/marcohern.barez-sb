package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CondicionVenta")
public class CondicionVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCondicionVenta", nullable = false)
    private Integer idCondicionVenta;

    @Column(name = "CondicionVenta", nullable = false, length = 50)
    private String condicionVenta;

    public Integer getIdCondicionVenta() { return idCondicionVenta; }
    public String getCondicionVenta() { return condicionVenta; }
}
