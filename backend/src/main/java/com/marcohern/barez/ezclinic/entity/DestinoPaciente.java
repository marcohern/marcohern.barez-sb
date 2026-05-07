package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DestinoPaciente")
public class DestinoPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDestinoPaciente", nullable = false)
    private Integer idDestinoPaciente;

    @Column(name = "DestinoPaciente", length = 50)
    private String destinoPaciente;

    public Integer getIdDestinoPaciente() { return idDestinoPaciente; }
    public String getDestinoPaciente() { return destinoPaciente; }
}
