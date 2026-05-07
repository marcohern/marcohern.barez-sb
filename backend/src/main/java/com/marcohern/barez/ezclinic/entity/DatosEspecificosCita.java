package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DatosEspecificosCita")
@IdClass(DatosEspecificosCitaId.class)
public class DatosEspecificosCita {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Column(name = "Dato")
    private String dato;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdPregunta() { return idPregunta; }
    public String getDato() { return dato; }
}
