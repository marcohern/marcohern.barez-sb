package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "IPSTarifas")
public class IPSTarifas {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "IdTarifaServicio")
    private Integer idTarifaServicio;

    @Column(name = "ValorServicio")
    private java.math.BigDecimal valorServicio;

    @Column(name = "IdTarifaCopago")
    private Integer idTarifaCopago;

    @Column(name = "ValorCopago")
    private java.math.BigDecimal valorCopago;

    @Column(name = "IdTablaCop")
    private Integer idTablaCop;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdTarifaServicio() { return idTarifaServicio; }
    public java.math.BigDecimal getValorServicio() { return valorServicio; }
    public Integer getIdTarifaCopago() { return idTarifaCopago; }
    public java.math.BigDecimal getValorCopago() { return valorCopago; }
    public Integer getIdTablaCop() { return idTablaCop; }
}
