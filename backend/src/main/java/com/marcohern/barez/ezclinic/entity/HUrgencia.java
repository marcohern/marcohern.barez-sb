package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "HUrgencia")
public class HUrgencia {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "FechaEgreso")
    private java.time.LocalDateTime fechaEgreso;

    @Column(name = "HoraEgreso")
    private java.time.LocalDateTime horaEgreso;

    @Column(name = "HorasObservacion", length = 3)
    private String horasObservacion;

    @Column(name = "EstadoSalida", nullable = false)
    private Boolean estadoSalida;

    @Column(name = "DiasIncapacidad", length = 3)
    private String diasIncapacidad;

    @Column(name = "IdDestinoPaciente")
    private Integer idDestinoPaciente;

    @Column(name = "IdCausaExterna")
    private Integer idCausaExterna;

    @Column(name = "DescripcionUrgencia")
    private String descripcionUrgencia;

    @Column(name = "DetallesIngreso")
    private String detallesIngreso;

    public Integer getIdAuto() { return idAuto; }
    public java.time.LocalDateTime getFechaEgreso() { return fechaEgreso; }
    public java.time.LocalDateTime getHoraEgreso() { return horaEgreso; }
    public String getHorasObservacion() { return horasObservacion; }
    public Boolean getEstadoSalida() { return estadoSalida; }
    public String getDiasIncapacidad() { return diasIncapacidad; }
    public Integer getIdDestinoPaciente() { return idDestinoPaciente; }
    public Integer getIdCausaExterna() { return idCausaExterna; }
    public String getDescripcionUrgencia() { return descripcionUrgencia; }
    public String getDetallesIngreso() { return detallesIngreso; }
}
