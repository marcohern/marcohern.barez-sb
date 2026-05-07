package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ParametrosPreguntas")
@IdClass(ParametrosPreguntasId.class)
public class ParametrosPreguntas {

    @Id
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Id
    @Column(name = "IdParametro", nullable = false)
    private Integer idParametro;

    @Column(name = "Ordinal")
    private Short ordinal;

    public Integer getIdPregunta() { return idPregunta; }
    public Integer getIdParametro() { return idParametro; }
    public Short getOrdinal() { return ordinal; }
}
