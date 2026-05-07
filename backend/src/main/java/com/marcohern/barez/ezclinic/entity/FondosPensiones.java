package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FondosPensiones")
public class FondosPensiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAFP", nullable = false)
    private Integer idAFP;

    @Column(name = "Fondo", length = 200)
    private String fondo;

    @Column(name = "CodAFP", length = 10)
    private String codAFP;

    public Integer getIdAFP() { return idAFP; }
    public String getFondo() { return fondo; }
    public String getCodAFP() { return codAFP; }
}
