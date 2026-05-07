package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Resultados")
public class Resultados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdResultado", nullable = false)
    private Integer idResultado;

    @Column(name = "Resultado", length = 150)
    private String resultado;

    public Integer getIdResultado() { return idResultado; }
    public String getResultado() { return resultado; }
}
