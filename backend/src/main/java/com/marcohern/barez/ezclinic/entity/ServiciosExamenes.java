package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ServiciosExamenes")
@IdClass(ServiciosExamenesId.class)
public class ServiciosExamenes {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Id
    @Column(name = "IdExamen", nullable = false)
    private Integer idExamen;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdExamen() { return idExamen; }
}
