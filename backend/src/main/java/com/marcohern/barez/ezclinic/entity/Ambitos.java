package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Ambitos")
public class Ambitos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAmbito", nullable = false)
    private Integer idAmbito;

    @Column(name = "Ambito", length = 50)
    private String ambito;

    public Integer getIdAmbito() { return idAmbito; }
    public String getAmbito() { return ambito; }
}
