package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Psicologia")
public class Psicologia {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "Genograma")
    private String genograma;

    @Column(name = "PlanIntervencion")
    private String planIntervencion;

    public Integer getIdAuto() { return idAuto; }
    public String getGenograma() { return genograma; }
    public String getPlanIntervencion() { return planIntervencion; }
}
