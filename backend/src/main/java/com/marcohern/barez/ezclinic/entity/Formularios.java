package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Formularios")
public class Formularios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFormulario", nullable = false)
    private Integer idFormulario;

    @Column(name = "Formulario", length = 50)
    private String formulario;

    public Integer getIdFormulario() { return idFormulario; }
    public String getFormulario() { return formulario; }
}
