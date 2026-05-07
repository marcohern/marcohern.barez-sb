package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "SeleccionPreguntas")
@IdClass(SeleccionPreguntasId.class)
public class SeleccionPreguntas {

    @Id
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Id
    @Column(name = "IdSeleccion", nullable = false)
    private Integer idSeleccion;

    @Column(name = "Predeterminado", nullable = false)
    private Boolean predeterminado;

    public Integer getIdPregunta() { return idPregunta; }
    public Integer getIdSeleccion() { return idSeleccion; }
    public Boolean getPredeterminado() { return predeterminado; }
}
