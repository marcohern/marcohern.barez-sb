package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "PerfilesEmpleado")
@IdClass(PerfilesEmpleadoId.class)
public class PerfilesEmpleado {

    @Id
    @Column(name = "IdEmpleado", nullable = false)
    private Integer idEmpleado;

    @Id
    @Column(name = "IdPerfil", nullable = false)
    private Integer idPerfil;

    public Integer getIdEmpleado() { return idEmpleado; }
    public Integer getIdPerfil() { return idPerfil; }
}
