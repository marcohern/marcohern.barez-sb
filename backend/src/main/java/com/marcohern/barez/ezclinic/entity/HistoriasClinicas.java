package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "HistoriasClinicas")
public class HistoriasClinicas {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "IdMedico")
    private Integer idMedico;

    @Column(name = "Fecha")
    private java.time.LocalDateTime fecha;

    @Column(name = "Hora")
    private java.time.LocalDateTime hora;

    @Column(name = "IdTablaCIE", nullable = false)
    private Integer idTablaCIE;

    @Column(name = "IdDiagnostico")
    private Integer idDiagnostico;

    @Column(name = "IdDiagnostico1")
    private Integer idDiagnostico1;

    @Column(name = "IdDiagnostico2")
    private Integer idDiagnostico2;

    @Column(name = "IdDiagnostico3")
    private Integer idDiagnostico3;

    @Column(name = "IdEmbarazo")
    private Integer idEmbarazo;

    @Column(name = "DetallesConductas")
    private String detallesConductas;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "AdvertenciaRiesgos")
    private Boolean advertenciaRiesgos;

    @Column(name = "Duracion")
    private Double duracion;

    @Column(name = "NotaExtension")
    private String notaExtension;

    @Column(name = "IdRecomendacion")
    private Integer idRecomendacion;

    @Column(name = "IdIndicacion")
    private Integer idIndicacion;

    @Column(name = "IdDetallesDiagnostico")
    private Integer idDetallesDiagnostico;

    @Column(name = "ServicioAtendido")
    private Boolean servicioAtendido;

    @Column(name = "RegistroBloqueado")
    private Boolean registroBloqueado;

    @Column(name = "DatosGraficos")
    private String datosGraficos;

    @Column(name = "FechaCreacion")
    private java.time.LocalDateTime fechaCreacion;

    @Column(name = "DatosGraficosXML")
    private String datosGraficosXML;

    @Column(name = "IdMotivoExamen")
    private Integer idMotivoExamen;

    @Column(name = "IdModalidadAtencion")
    private Integer idModalidadAtencion;

    @Column(name = "IdResultado")
    private Integer idResultado;

    @Column(name = "Interpretacion")
    private String interpretacion;

    @Column(name = "IdResultadoCalificacion")
    private Integer idResultadoCalificacion;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdMedico() { return idMedico; }
    public java.time.LocalDateTime getFecha() { return fecha; }
    public java.time.LocalDateTime getHora() { return hora; }
    public Integer getIdTablaCIE() { return idTablaCIE; }
    public Integer getIdDiagnostico() { return idDiagnostico; }
    public Integer getIdDiagnostico1() { return idDiagnostico1; }
    public Integer getIdDiagnostico2() { return idDiagnostico2; }
    public Integer getIdDiagnostico3() { return idDiagnostico3; }
    public Integer getIdEmbarazo() { return idEmbarazo; }
    public String getDetallesConductas() { return detallesConductas; }
    public String getObservaciones() { return observaciones; }
    public Boolean getAdvertenciaRiesgos() { return advertenciaRiesgos; }
    public Double getDuracion() { return duracion; }
    public String getNotaExtension() { return notaExtension; }
    public Integer getIdRecomendacion() { return idRecomendacion; }
    public Integer getIdIndicacion() { return idIndicacion; }
    public Integer getIdDetallesDiagnostico() { return idDetallesDiagnostico; }
    public Boolean getServicioAtendido() { return servicioAtendido; }
    public Boolean getRegistroBloqueado() { return registroBloqueado; }
    public String getDatosGraficos() { return datosGraficos; }
    public java.time.LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public String getDatosGraficosXML() { return datosGraficosXML; }
    public Integer getIdMotivoExamen() { return idMotivoExamen; }
    public Integer getIdModalidadAtencion() { return idModalidadAtencion; }
    public Integer getIdResultado() { return idResultado; }
    public String getInterpretacion() { return interpretacion; }
    public Integer getIdResultadoCalificacion() { return idResultadoCalificacion; }
}
