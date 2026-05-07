package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "UnidadesProducto")
public class UnidadesProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUnidad", nullable = false)
    private Integer idUnidad;

    @Column(name = "Unidad", nullable = false, length = 40)
    private String unidad;

    @Column(name = "Codigo", nullable = false, length = 3)
    private String codigo;

    public Integer getIdUnidad() { return idUnidad; }
    public String getUnidad() { return unidad; }
    public String getCodigo() { return codigo; }
}
