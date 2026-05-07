package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RecursosMedicos")
@IdClass(RecursosMedicosId.class)
public class RecursosMedicos {

    @Id
    @Column(name = "IdRecurso", nullable = false)
    private Integer idRecurso;

    @Id
    @Column(name = "IdClasificacion", nullable = false)
    private Integer idClasificacion;

    @Id
    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    @Id
    @Column(name = "IdMedico", nullable = false)
    private Integer idMedico;

    public Integer getIdRecurso() { return idRecurso; }
    public Integer getIdClasificacion() { return idClasificacion; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
    public Integer getIdMedico() { return idMedico; }
}
