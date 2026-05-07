package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AbonosCitas")
@IdClass(AbonosCitasId.class)
public class AbonosCitas {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "ReciboNo", nullable = false)
    private Integer reciboNo;

    @Column(name = "Valor")
    private java.math.BigDecimal valor;

    public Integer getIdAuto() { return idAuto; }
    public Integer getReciboNo() { return reciboNo; }
    public java.math.BigDecimal getValor() { return valor; }
}
