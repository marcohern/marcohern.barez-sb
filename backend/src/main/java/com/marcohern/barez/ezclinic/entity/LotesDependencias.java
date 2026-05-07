package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "LotesDependencias")
@IdClass(LotesDependenciasId.class)
public class LotesDependencias {

    @Id
    @Column(name = "IdLote", nullable = false)
    private Integer idLote;

    @Id
    @Column(name = "IdDependencia", nullable = false)
    private Integer idDependencia;

    @Column(name = "Existencias", nullable = false)
    private Integer existencias;

    public Integer getIdLote() { return idLote; }
    public Integer getIdDependencia() { return idDependencia; }
    public Integer getExistencias() { return existencias; }
}
