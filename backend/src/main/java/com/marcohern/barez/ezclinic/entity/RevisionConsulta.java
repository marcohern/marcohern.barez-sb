package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RevisionConsulta")
public class RevisionConsulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRevision", nullable = false)
    private Integer idRevision;

    @Column(name = "IdCampo")
    private Integer idCampo;

    @Column(name = "Valor")
    private String valor;

    @Column(name = "Predeterminado", nullable = false)
    private Boolean predeterminado;

    public Integer getIdRevision() { return idRevision; }
    public Integer getIdCampo() { return idCampo; }
    public String getValor() { return valor; }
    public Boolean getPredeterminado() { return predeterminado; }
}
