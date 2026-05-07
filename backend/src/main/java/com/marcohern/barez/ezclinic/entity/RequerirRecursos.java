package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RequerirRecursos")
@IdClass(RequerirRecursosId.class)
public class RequerirRecursos {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Id
    @Column(name = "IdClasificacion", nullable = false)
    private Integer idClasificacion;

    @Column(name = "CantRecurso")
    private Integer cantRecurso;

    @Column(name = "Prioritario", nullable = false)
    private Boolean prioritario;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdClasificacion() { return idClasificacion; }
    public Integer getCantRecurso() { return cantRecurso; }
    public Boolean getPrioritario() { return prioritario; }
    public String getObservaciones() { return observaciones; }
}
