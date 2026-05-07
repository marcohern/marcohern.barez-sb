package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoEmpleado")
public class TipoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoEmpleado", nullable = false)
    private Integer idTipoEmpleado;

    @Column(name = "TipoEmpleado", length = 20)
    private String tipoEmpleado;

    public Integer getIdTipoEmpleado() { return idTipoEmpleado; }
    public String getTipoEmpleado() { return tipoEmpleado; }
}
