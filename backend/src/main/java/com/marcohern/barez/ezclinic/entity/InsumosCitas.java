package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "InsumosCitas")
@IdClass(InsumosCitasId.class)
public class InsumosCitas {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdInsumo", nullable = false)
    private Integer idInsumo;

    @Column(name = "PagoInsumos")
    private java.math.BigDecimal pagoInsumos;

    @Column(name = "CopagoInsumos")
    private java.math.BigDecimal copagoInsumos;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdInsumo() { return idInsumo; }
    public java.math.BigDecimal getPagoInsumos() { return pagoInsumos; }
    public java.math.BigDecimal getCopagoInsumos() { return copagoInsumos; }
}
