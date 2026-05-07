package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Auxiliares")
public class Auxiliares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAuxiliar", nullable = false)
    private Integer idAuxiliar;

    @Column(name = "Auxiliar", length = 100)
    private String auxiliar;

    public Integer getIdAuxiliar() { return idAuxiliar; }
    public String getAuxiliar() { return auxiliar; }
}
