package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoOperacion")
public class TipoOperacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoOperacion", nullable = false)
    private Short idTipoOperacion;

    @Column(name = "Codigo", nullable = false, length = 20)
    private String codigo;

    @Column(name = "Descripcion", nullable = false, length = 1000)
    private String descripcion;

    public Short getIdTipoOperacion() { return idTipoOperacion; }
    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
}
