package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DestinoRecursos")
@IdClass(DestinoRecursosId.class)
public class DestinoRecursos {

    @Id
    @Column(name = "IdRecurso", nullable = false)
    private Integer idRecurso;

    @Id
    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    @Id
    @Column(name = "IdClasificacion", nullable = false)
    private Integer idClasificacion;

    public Integer getIdRecurso() { return idRecurso; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
    public Integer getIdClasificacion() { return idClasificacion; }
}
