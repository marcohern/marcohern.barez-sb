package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Restricciones")
public class Restricciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRestriccion", nullable = false)
    private Integer idRestriccion;

    @Column(name = "IdAuto")
    private Integer idAuto;

    @Column(name = "Restriccion")
    private String restriccion;

    @Column(name = "IdVigencia")
    private Integer idVigencia;

    public Integer getIdRestriccion() { return idRestriccion; }
    public Integer getIdAuto() { return idAuto; }
    public String getRestriccion() { return restriccion; }
    public Integer getIdVigencia() { return idVigencia; }
}
