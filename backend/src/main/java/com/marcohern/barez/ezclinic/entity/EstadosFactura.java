package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EstadosFactura")
public class EstadosFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEstado", nullable = false)
    private Integer idEstado;

    @Column(name = "Estado", nullable = false, length = 20)
    private String estado;

    public Integer getIdEstado() { return idEstado; }
    public String getEstado() { return estado; }
}
