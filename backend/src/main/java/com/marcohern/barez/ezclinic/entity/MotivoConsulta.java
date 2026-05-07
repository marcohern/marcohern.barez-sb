package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "MotivoConsulta")
public class MotivoConsulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMotivoConsulta", nullable = false)
    private Integer idMotivoConsulta;

    @Column(name = "MotivoConsulta")
    private String motivoConsulta;

    public Integer getIdMotivoConsulta() { return idMotivoConsulta; }
    public String getMotivoConsulta() { return motivoConsulta; }
}
