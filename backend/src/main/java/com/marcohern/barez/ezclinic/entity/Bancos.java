package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Bancos")
public class Bancos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBanco", nullable = false)
    private Integer idBanco;

    @Column(name = "Banco", length = 100)
    private String banco;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdBanco() { return idBanco; }
    public String getBanco() { return banco; }
    public Boolean getSuspendido() { return suspendido; }
}
