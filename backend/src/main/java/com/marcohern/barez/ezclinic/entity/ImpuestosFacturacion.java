package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ImpuestosFacturacion")
public class ImpuestosFacturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdImpuesto", nullable = false)
    private Long idImpuesto;

    @Column(name = "IdFactura", nullable = false)
    private Integer idFactura;

    @Column(name = "IdTributo", nullable = false)
    private Integer idTributo;

    @Column(name = "ValorBase", nullable = false)
    private java.math.BigDecimal valorBase;

    @Column(name = "PorcentajeTributo")
    private Float porcentajeTributo;

    @Column(name = "ValorTributo")
    private java.math.BigDecimal valorTributo;

    public Long getIdImpuesto() { return idImpuesto; }
    public Integer getIdFactura() { return idFactura; }
    public Integer getIdTributo() { return idTributo; }
    public java.math.BigDecimal getValorBase() { return valorBase; }
    public Float getPorcentajeTributo() { return porcentajeTributo; }
    public java.math.BigDecimal getValorTributo() { return valorTributo; }
}
