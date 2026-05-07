package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "SeccionesFormulario")
@IdClass(SeccionesFormularioId.class)
public class SeccionesFormulario {

    @Id
    @Column(name = "IdSeccion", nullable = false)
    private Integer idSeccion;

    @Id
    @Column(name = "IdFormulario", nullable = false)
    private Integer idFormulario;

    @Column(name = "Ordinal", nullable = false)
    private Integer ordinal;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdSeccion() { return idSeccion; }
    public Integer getIdFormulario() { return idFormulario; }
    public Integer getOrdinal() { return ordinal; }
    public Boolean getSuspendido() { return suspendido; }
}
