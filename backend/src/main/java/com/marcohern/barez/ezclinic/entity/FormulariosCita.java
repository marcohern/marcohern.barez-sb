package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FormulariosCita")
@IdClass(FormulariosCitaId.class)
public class FormulariosCita {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdFormulario", nullable = false)
    private Integer idFormulario;

    @Id
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Column(name = "IdSeccion", nullable = false)
    private Integer idSeccion;

    @Column(name = "OrdinalPregunta", nullable = false)
    private Integer ordinalPregunta;

    @Column(name = "OrdinalSeccion", nullable = false)
    private Integer ordinalSeccion;

    @Column(name = "Dato", length = 1000)
    private String dato;

    @Column(name = "DatoModificado", length = 1000)
    private String datoModificado;

    @Column(name = "FechaModificacion")
    private java.time.LocalDateTime fechaModificacion;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdFormulario() { return idFormulario; }
    public Integer getIdPregunta() { return idPregunta; }
    public Integer getIdSeccion() { return idSeccion; }
    public Integer getOrdinalPregunta() { return ordinalPregunta; }
    public Integer getOrdinalSeccion() { return ordinalSeccion; }
    public String getDato() { return dato; }
    public String getDatoModificado() { return datoModificado; }
    public java.time.LocalDateTime getFechaModificacion() { return fechaModificacion; }
}
