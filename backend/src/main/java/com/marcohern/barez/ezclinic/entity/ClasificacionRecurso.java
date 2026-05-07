package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ClasificacionRecurso")
public class ClasificacionRecurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdClasificacion", nullable = false)
    private Integer idClasificacion;

    @Column(name = "Clasificacion", length = 50)
    private String clasificacion;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdClasificacion() { return idClasificacion; }
    public String getClasificacion() { return clasificacion; }
    public String getDescripcion() { return descripcion; }
}
