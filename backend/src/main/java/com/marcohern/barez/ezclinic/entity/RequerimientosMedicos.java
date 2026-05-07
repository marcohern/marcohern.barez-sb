package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RequerimientosMedicos")
@IdClass(RequerimientosMedicosId.class)
public class RequerimientosMedicos {

    @Id
    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "NumeroMedicos")
    private Integer numeroMedicos;

    @Column(name = "Funciones")
    private String funciones;

    @Column(name = "Prioritario", nullable = false)
    private Boolean prioritario;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdEspecialidad() { return idEspecialidad; }
    public Integer getIdServicio() { return idServicio; }
    public Integer getNumeroMedicos() { return numeroMedicos; }
    public String getFunciones() { return funciones; }
    public Boolean getPrioritario() { return prioritario; }
    public String getObservaciones() { return observaciones; }
}
