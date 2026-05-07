package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoIdentificacion")
public class TipoIdentificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoIdentificacion", nullable = false)
    private Integer idTipoIdentificacion;

    @Column(name = "TipoIdentificacionUsuario", length = 50)
    private String tipoIdentificacionUsuario;

    @Column(name = "ValorTipoID", length = 2)
    private String valorTipoID;

    @Column(name = "LongitudMin", nullable = false)
    private Integer longitudMin;

    @Column(name = "LongitudMax", nullable = false)
    private Integer longitudMax;

    @Column(name = "TiempoMin", nullable = false)
    private Integer tiempoMin;

    @Column(name = "TiempoMax", nullable = false)
    private Integer tiempoMax;

    @Column(name = "AplicaNacionales", nullable = false)
    private Boolean aplicaNacionales;

    @Column(name = "AplicaExtranjeros", nullable = false)
    private Boolean aplicaExtranjeros;

    @Column(name = "esAlfanumerico", nullable = false)
    private Boolean esAlfanumerico;

    @Column(name = "ExpresionRegular", length = 50)
    private String expresionRegular;

    public Integer getIdTipoIdentificacion() { return idTipoIdentificacion; }
    public String getTipoIdentificacionUsuario() { return tipoIdentificacionUsuario; }
    public String getValorTipoID() { return valorTipoID; }
    public Integer getLongitudMin() { return longitudMin; }
    public Integer getLongitudMax() { return longitudMax; }
    public Integer getTiempoMin() { return tiempoMin; }
    public Integer getTiempoMax() { return tiempoMax; }
    public Boolean getAplicaNacionales() { return aplicaNacionales; }
    public Boolean getAplicaExtranjeros() { return aplicaExtranjeros; }
    public Boolean getEsAlfanumerico() { return esAlfanumerico; }
    public String getExpresionRegular() { return expresionRegular; }
}
