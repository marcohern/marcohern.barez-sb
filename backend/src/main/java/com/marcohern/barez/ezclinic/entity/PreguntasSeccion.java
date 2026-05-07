package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "PreguntasSeccion")
@IdClass(PreguntasSeccionId.class)
public class PreguntasSeccion {

    @Id
    @Column(name = "IdSeccion", nullable = false)
    private Integer idSeccion;

    @Id
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Column(name = "Ordinal", nullable = false)
    private Integer ordinal;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdSeccion() { return idSeccion; }
    public Integer getIdPregunta() { return idPregunta; }
    public Integer getOrdinal() { return ordinal; }
    public Boolean getSuspendido() { return suspendido; }
}
