package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ClasificacionServicios")
public class ClasificacionServicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdClasificacion", nullable = false)
    private Integer idClasificacion;

    @Column(name = "Clasificacion", length = 50)
    private String clasificacion;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdClasificacion() { return idClasificacion; }
    public String getClasificacion() { return clasificacion; }
    public String getDescripcion() { return descripcion; }
    public String getObservaciones() { return observaciones; }
}
