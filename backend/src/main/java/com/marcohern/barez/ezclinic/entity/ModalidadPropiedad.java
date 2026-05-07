package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ModalidadPropiedad")
public class ModalidadPropiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdModalidad", nullable = false)
    private Integer idModalidad;

    @Column(name = "Modalidad", length = 50)
    private String modalidad;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdModalidad() { return idModalidad; }
    public String getModalidad() { return modalidad; }
    public String getDescripcion() { return descripcion; }
}
