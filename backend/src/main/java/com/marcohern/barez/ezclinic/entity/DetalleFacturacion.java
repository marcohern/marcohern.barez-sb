package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DetalleFacturacion")
public class DetalleFacturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDetalle", nullable = false)
    private Long idDetalle;

    @Column(name = "IdFactura", nullable = false)
    private Integer idFactura;

    @Column(name = "CodigoProducto", nullable = false, length = 40)
    private String codigoProducto;

    @Column(name = "Producto", nullable = false, length = 200)
    private String producto;

    @Column(name = "CodigoUnidad", nullable = false, length = 3)
    private String codigoUnidad;

    @Column(name = "Consecutivo", nullable = false)
    private Short consecutivo;

    @Column(name = "Cantidad", nullable = false)
    private Float cantidad;

    @Column(name = "Valor", nullable = false)
    private java.math.BigDecimal valor;

    @Column(name = "PorcentajeDescuento", nullable = false)
    private Float porcentajeDescuento;

    @Column(name = "Descuento", nullable = false)
    private java.math.BigDecimal descuento;

    @Column(name = "ValorTotal", nullable = false)
    private java.math.BigDecimal valorTotal;

    @Column(name = "PorcentajeIVA")
    private Float porcentajeIVA;

    @Column(name = "ValorIVA")
    private java.math.BigDecimal valorIVA;

    @Column(name = "Nota", length = 4000)
    private String nota;

    public Long getIdDetalle() { return idDetalle; }
    public Integer getIdFactura() { return idFactura; }
    public String getCodigoProducto() { return codigoProducto; }
    public String getProducto() { return producto; }
    public String getCodigoUnidad() { return codigoUnidad; }
    public Short getConsecutivo() { return consecutivo; }
    public Float getCantidad() { return cantidad; }
    public java.math.BigDecimal getValor() { return valor; }
    public Float getPorcentajeDescuento() { return porcentajeDescuento; }
    public java.math.BigDecimal getDescuento() { return descuento; }
    public java.math.BigDecimal getValorTotal() { return valorTotal; }
    public Float getPorcentajeIVA() { return porcentajeIVA; }
    public java.math.BigDecimal getValorIVA() { return valorIVA; }
    public String getNota() { return nota; }
}
