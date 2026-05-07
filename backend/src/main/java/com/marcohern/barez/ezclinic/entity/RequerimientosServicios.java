package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RequerimientosServicios")
@IdClass(RequerimientosServiciosId.class)
public class RequerimientosServicios {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Id
    @Column(name = "IdServicio1", nullable = false)
    private Integer idServicio1;

    @Column(name = "NumeroServicio")
    private Integer numeroServicio;

    @Column(name = "Prioritario", nullable = false)
    private Boolean prioritario;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdServicio1() { return idServicio1; }
    public Integer getNumeroServicio() { return numeroServicio; }
    public Boolean getPrioritario() { return prioritario; }
    public String getObservaciones() { return observaciones; }
}
