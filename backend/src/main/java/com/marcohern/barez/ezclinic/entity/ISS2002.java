package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ISS2002")
public class ISS2002 {

    @Column(name = "Referencia", length = 12)
    private String referencia;

    @Id
    @Column(name = "CodigoCUPS", nullable = false, length = 8)
    private String codigoCUPS;

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

    public String getReferencia() { return referencia; }
    public String getCodigoCUPS() { return codigoCUPS; }
    public Integer getIdTarifaServicio() { return idTarifaServicio; }
    public java.math.BigDecimal getValorServicio() { return valorServicio; }
    public Integer getIdTarifaCopago() { return idTarifaCopago; }
    public java.math.BigDecimal getValorCopago() { return valorCopago; }
    public Integer getIdTablaCop() { return idTablaCop; }
}
