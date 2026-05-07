package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AbonosFactura")
public class AbonosFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAbono", nullable = false)
    private Integer idAbono;

    @Column(name = "IdFactura", nullable = false)
    private Integer idFactura;

    @Column(name = "Valor")
    private java.math.BigDecimal valor;

    @Column(name = "Fecha")
    private java.time.LocalDateTime fecha;

    @Column(name = "IdFormaPago")
    private Integer idFormaPago;

    @Column(name = "IdBanco")
    private Integer idBanco;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "IdContacto", nullable = false)
    private Integer idContacto;

    @Column(name = "EsPorcentajeDeduccion", nullable = false)
    private Boolean esPorcentajeDeduccion;

    @Column(name = "ReteICA")
    private Float reteICA;

    @Column(name = "ReteFuente")
    private Float reteFuente;

    public Integer getIdAbono() { return idAbono; }
    public Integer getIdFactura() { return idFactura; }
    public java.math.BigDecimal getValor() { return valor; }
    public java.time.LocalDateTime getFecha() { return fecha; }
    public Integer getIdFormaPago() { return idFormaPago; }
    public Integer getIdBanco() { return idBanco; }
    public String getObservaciones() { return observaciones; }
    public Integer getIdContacto() { return idContacto; }
    public Boolean getEsPorcentajeDeduccion() { return esPorcentajeDeduccion; }
    public Float getReteICA() { return reteICA; }
    public Float getReteFuente() { return reteFuente; }
}
