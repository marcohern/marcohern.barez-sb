package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Actividades")
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdActividad", nullable = false)
    private Integer idActividad;

    @Column(name = "CodigoActividad", length = 15)
    private String codigoActividad;

    @Column(name = "Actividad", length = 500)
    private String actividad;

    public Integer getIdActividad() { return idActividad; }
    public String getCodigoActividad() { return codigoActividad; }
    public String getActividad() { return actividad; }
}
