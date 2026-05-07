package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Evolucion")
public class Evolucion {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "ExamenClinico")
    private String examenClinico;

    @Column(name = "Evolucion")
    private String evolucion;

    @Column(name = "Tratamiento")
    private String tratamiento;

    @Column(name = "Datos")
    private String datos;

    public Integer getIdAuto() { return idAuto; }
    public String getExamenClinico() { return examenClinico; }
    public String getEvolucion() { return evolucion; }
    public String getTratamiento() { return tratamiento; }
    public String getDatos() { return datos; }
}
