package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Embarazo")
public class Embarazo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmbarazo", nullable = false)
    private Integer idEmbarazo;

    @Column(name = "EstadoEmbarazo", length = 30)
    private String estadoEmbarazo;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdEmbarazo() { return idEmbarazo; }
    public String getEstadoEmbarazo() { return estadoEmbarazo; }
    public String getDescripcion() { return descripcion; }
}
