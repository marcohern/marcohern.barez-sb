package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Preguntas")
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Column(name = "IdTipoDato")
    private Integer idTipoDato;

    @Column(name = "IdUnidad")
    private Integer idUnidad;

    @Column(name = "Pregunta", length = 1000)
    private String pregunta;

    @Column(name = "IdAmbito")
    private Integer idAmbito;

    public Integer getIdPregunta() { return idPregunta; }
    public Integer getIdTipoDato() { return idTipoDato; }
    public Integer getIdUnidad() { return idUnidad; }
    public String getPregunta() { return pregunta; }
    public Integer getIdAmbito() { return idAmbito; }
}
