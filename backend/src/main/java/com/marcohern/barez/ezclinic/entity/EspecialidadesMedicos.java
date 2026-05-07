package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EspecialidadesMedicos")
@IdClass(EspecialidadesMedicosId.class)
public class EspecialidadesMedicos {

    @Id
    @Column(name = "IdMedico", nullable = false)
    private Integer idMedico;

    @Id
    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    public Integer getIdMedico() { return idMedico; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
}
