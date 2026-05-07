package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Estados")
public class Estados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEstado", nullable = false)
    private Integer idEstado;

    @Column(name = "Estado", nullable = false, length = 20)
    private String estado;

    @Column(name = "Ordinal", nullable = false)
    private Short ordinal;

    public Integer getIdEstado() { return idEstado; }
    public String getEstado() { return estado; }
    public Short getOrdinal() { return ordinal; }
}
