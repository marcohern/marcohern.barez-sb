package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DependenciasIPS")
@IdClass(DependenciasIPSId.class)
public class DependenciasIPS {

    @Id
    @Column(name = "IdIPS", nullable = false)
    private Integer idIPS;

    @Id
    @Column(name = "IdDependencia", nullable = false)
    private Integer idDependencia;

    public Integer getIdIPS() { return idIPS; }
    public Integer getIdDependencia() { return idDependencia; }
}
