package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CategoriasSistema")
public class CategoriasSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCategoria", nullable = false)
    private Integer idCategoria;

    @Column(name = "Descripcion", length = 500)
    private String descripcion;

    public Integer getIdCategoria() { return idCategoria; }
    public String getDescripcion() { return descripcion; }
}
