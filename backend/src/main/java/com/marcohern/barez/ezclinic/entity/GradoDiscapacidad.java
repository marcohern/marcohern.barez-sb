package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "GradoDiscapacidad")
public class GradoDiscapacidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGradoDiscapacidad", nullable = false)
    private Integer idGradoDiscapacidad;

    @Column(name = "GradoDiscapacidad", length = 15)
    private String gradoDiscapacidad;

    public Integer getIdGradoDiscapacidad() { return idGradoDiscapacidad; }
    public String getGradoDiscapacidad() { return gradoDiscapacidad; }
}
