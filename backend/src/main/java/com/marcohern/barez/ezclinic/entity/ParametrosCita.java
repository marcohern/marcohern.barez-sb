package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ParametrosCita")
@IdClass(ParametrosCitaId.class)
public class ParametrosCita {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Id
    @Column(name = "IdParametro", nullable = false)
    private Integer idParametro;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdPregunta() { return idPregunta; }
    public Integer getIdParametro() { return idParametro; }
}
