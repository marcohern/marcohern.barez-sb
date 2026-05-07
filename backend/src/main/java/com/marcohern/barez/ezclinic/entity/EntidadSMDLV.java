package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EntidadSMDLV")
public class EntidadSMDLV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSMDLV", nullable = false)
    private Integer idSMDLV;

    @Column(name = "ValorSMDLV")
    private java.math.BigDecimal valorSMDLV;

    public Integer getIdSMDLV() { return idSMDLV; }
    public java.math.BigDecimal getValorSMDLV() { return valorSMDLV; }
}
