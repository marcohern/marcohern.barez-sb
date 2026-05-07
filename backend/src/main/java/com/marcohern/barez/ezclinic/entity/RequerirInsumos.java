package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RequerirInsumos")
@IdClass(RequerirInsumosId.class)
public class RequerirInsumos {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Id
    @Column(name = "IdInsumo", nullable = false)
    private Integer idInsumo;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdInsumo() { return idInsumo; }
    public Integer getCantidad() { return cantidad; }
    public String getObservaciones() { return observaciones; }
}
