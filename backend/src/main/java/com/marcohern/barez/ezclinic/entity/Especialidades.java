package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Especialidades")
public class Especialidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    @Column(name = "Especialidades", length = 100)
    private String especialidades;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "ValorRIA", length = 3)
    private String valorRIA;

    public Integer getIdEspecialidad() { return idEspecialidad; }
    public String getEspecialidades() { return especialidades; }
    public String getDescripcion() { return descripcion; }
    public String getValorRIA() { return valorRIA; }
}
