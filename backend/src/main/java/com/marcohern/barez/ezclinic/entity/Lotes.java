package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Lotes")
public class Lotes {

    @Column(name = "IdInsumo", nullable = false)
    private Integer idInsumo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdLote", nullable = false)
    private Integer idLote;

    @Column(name = "IdProveedor")
    private Integer idProveedor;

    @Column(name = "NombreInterno", length = 150)
    private String nombreInterno;

    @Column(name = "NumLote", length = 50)
    private String numLote;

    @Column(name = "IdFabricante")
    private Integer idFabricante;

    @Column(name = "UniEmpaque", length = 50)
    private String uniEmpaque;

    @Column(name = "FechaAdquisicion")
    private java.time.LocalDateTime fechaAdquisicion;

    @Column(name = "FechaVencimiento")
    private java.time.LocalDateTime fechaVencimiento;

    @Column(name = "CostoUniAquisicion")
    private java.math.BigDecimal costoUniAquisicion;

    @Column(name = "PrecioVenta")
    private java.math.BigDecimal precioVenta;

    @Column(name = "LoteSuspendido", nullable = false)
    private Boolean loteSuspendido;

    public Integer getIdInsumo() { return idInsumo; }
    public Integer getIdLote() { return idLote; }
    public Integer getIdProveedor() { return idProveedor; }
    public String getNombreInterno() { return nombreInterno; }
    public String getNumLote() { return numLote; }
    public Integer getIdFabricante() { return idFabricante; }
    public String getUniEmpaque() { return uniEmpaque; }
    public java.time.LocalDateTime getFechaAdquisicion() { return fechaAdquisicion; }
    public java.time.LocalDateTime getFechaVencimiento() { return fechaVencimiento; }
    public java.math.BigDecimal getCostoUniAquisicion() { return costoUniAquisicion; }
    public java.math.BigDecimal getPrecioVenta() { return precioVenta; }
    public Boolean getLoteSuspendido() { return loteSuspendido; }
}
