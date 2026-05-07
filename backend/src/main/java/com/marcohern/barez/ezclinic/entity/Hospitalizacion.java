package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Hospitalizacion")
public class Hospitalizacion {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "FechaEgreso")
    private java.time.LocalDateTime fechaEgreso;

    @Column(name = "HoraEgreso")
    private java.time.LocalDateTime horaEgreso;

    @Column(name = "DiasEstancia", length = 3)
    private String diasEstancia;

    @Column(name = "EstadoSalida", nullable = false)
    private Boolean estadoSalida;

    @Column(name = "DiasIncapacidad", length = 3)
    private String diasIncapacidad;

    @Column(name = "IdCausaExterna")
    private Integer idCausaExterna;

    @Column(name = "DescripcionHospitalizacion")
    private String descripcionHospitalizacion;

    @Column(name = "IdViaIngreso")
    private Integer idViaIngreso;

    @Column(name = "IdDiagnostico1")
    private Integer idDiagnostico1;

    @Column(name = "IdDiagnostico2")
    private Integer idDiagnostico2;

    @Column(name = "IdDiagnostico3")
    private Integer idDiagnostico3;

    @Column(name = "IdEnfermedadSobrecargada")
    private Integer idEnfermedadSobrecargada;

    @Column(name = "DetallesEnfermedadSobrecargada")
    private String detallesEnfermedadSobrecargada;

    public Integer getIdAuto() { return idAuto; }
    public java.time.LocalDateTime getFechaEgreso() { return fechaEgreso; }
    public java.time.LocalDateTime getHoraEgreso() { return horaEgreso; }
    public String getDiasEstancia() { return diasEstancia; }
    public Boolean getEstadoSalida() { return estadoSalida; }
    public String getDiasIncapacidad() { return diasIncapacidad; }
    public Integer getIdCausaExterna() { return idCausaExterna; }
    public String getDescripcionHospitalizacion() { return descripcionHospitalizacion; }
    public Integer getIdViaIngreso() { return idViaIngreso; }
    public Integer getIdDiagnostico1() { return idDiagnostico1; }
    public Integer getIdDiagnostico2() { return idDiagnostico2; }
    public Integer getIdDiagnostico3() { return idDiagnostico3; }
    public Integer getIdEnfermedadSobrecargada() { return idEnfermedadSobrecargada; }
    public String getDetallesEnfermedadSobrecargada() { return detallesEnfermedadSobrecargada; }
}
