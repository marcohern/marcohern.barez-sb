package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Solicitudes")
public class Solicitudes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSolicitud", nullable = false)
    private Long idSolicitud;

    @Column(name = "IdEPS", nullable = false)
    private Integer idEPS;

    @Column(name = "FechaSolicitud", nullable = false)
    private java.time.LocalDateTime fechaSolicitud;

    @Column(name = "FechaAsignacion", nullable = false)
    private java.time.LocalDateTime fechaAsignacion;

    @Column(name = "FechaAtencion")
    private java.time.LocalDateTime fechaAtencion;

    @Column(name = "IdDependencia", nullable = false)
    private Integer idDependencia;

    @Column(name = "IdContacto", nullable = false)
    private Integer idContacto;

    @Column(name = "SegunProfesiograma", nullable = false)
    private Boolean segunProfesiograma;

    @Column(name = "SegunAdjunto", nullable = false)
    private Boolean segunAdjunto;

    @Column(name = "PagoAnticipado", nullable = false)
    private Boolean pagoAnticipado;

    @Column(name = "FacturarServicios", nullable = false)
    private Boolean facturarServicios;

    @Column(name = "PagaTrabajador", nullable = false)
    private Boolean pagaTrabajador;

    @Column(name = "IdEstado", nullable = false)
    private Integer idEstado;

    @Column(name = "ExamenesTexto")
    private String examenesTexto;

    @Column(name = "Notas")
    private String notas;

    public Long getIdSolicitud() { return idSolicitud; }
    public Integer getIdEPS() { return idEPS; }
    public java.time.LocalDateTime getFechaSolicitud() { return fechaSolicitud; }
    public java.time.LocalDateTime getFechaAsignacion() { return fechaAsignacion; }
    public java.time.LocalDateTime getFechaAtencion() { return fechaAtencion; }
    public Integer getIdDependencia() { return idDependencia; }
    public Integer getIdContacto() { return idContacto; }
    public Boolean getSegunProfesiograma() { return segunProfesiograma; }
    public Boolean getSegunAdjunto() { return segunAdjunto; }
    public Boolean getPagoAnticipado() { return pagoAnticipado; }
    public Boolean getFacturarServicios() { return facturarServicios; }
    public Boolean getPagaTrabajador() { return pagaTrabajador; }
    public Integer getIdEstado() { return idEstado; }
    public String getExamenesTexto() { return examenesTexto; }
    public String getNotas() { return notas; }
}
