package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoDiscapacidad")
public class TipoDiscapacidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoDiscapacidad", nullable = false)
    private Integer idTipoDiscapacidad;

    @Column(name = "TipoDiscapacidad", length = 50)
    private String tipoDiscapacidad;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdTipoDiscapacidad() { return idTipoDiscapacidad; }
    public String getTipoDiscapacidad() { return tipoDiscapacidad; }
    public String getDescripcion() { return descripcion; }
}
