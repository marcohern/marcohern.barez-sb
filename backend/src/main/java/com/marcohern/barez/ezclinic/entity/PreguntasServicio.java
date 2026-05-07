package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "PreguntasServicio")
@IdClass(PreguntasServicioId.class)
public class PreguntasServicio {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Id
    @Column(name = "IdPregunta", nullable = false)
    private Integer idPregunta;

    @Column(name = "NumOrden")
    private Integer numOrden;

    @Column(name = "VisibleCertificado", nullable = false)
    private Boolean visibleCertificado;

    @Column(name = "IdTipoPregunta")
    private Integer idTipoPregunta;

    @Column(name = "OrdinalReporte")
    private Integer ordinalReporte;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdPregunta() { return idPregunta; }
    public Integer getNumOrden() { return numOrden; }
    public Boolean getVisibleCertificado() { return visibleCertificado; }
    public Integer getIdTipoPregunta() { return idTipoPregunta; }
    public Integer getOrdinalReporte() { return ordinalReporte; }
}
