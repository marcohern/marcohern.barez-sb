package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RecetasHClinica")
public class RecetasHClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdReceta", nullable = false)
    private Integer idReceta;

    @Column(name = "IdAuto")
    private Integer idAuto;

    @Column(name = "IdInsumo")
    private Integer idInsumo;

    @Column(name = "IdLote")
    private Integer idLote;

    @Column(name = "Cantidad", length = 50)
    private String cantidad;

    @Column(name = "Dosis", length = 50)
    private String dosis;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "NombreComercial", length = 200)
    private String nombreComercial;

    public Integer getIdReceta() { return idReceta; }
    public Integer getIdAuto() { return idAuto; }
    public Integer getIdInsumo() { return idInsumo; }
    public Integer getIdLote() { return idLote; }
    public String getCantidad() { return cantidad; }
    public String getDosis() { return dosis; }
    public String getObservaciones() { return observaciones; }
    public String getNombreComercial() { return nombreComercial; }
}
