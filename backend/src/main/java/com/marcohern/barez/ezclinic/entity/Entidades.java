package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Entidades")
public class Entidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEntidad", nullable = false)
    private Integer idEntidad;

    @Column(name = "Entidad", length = 50)
    private String entidad;

    @Column(name = "ValorUVR")
    private java.math.BigDecimal valorUVR;

    public Integer getIdEntidad() { return idEntidad; }
    public String getEntidad() { return entidad; }
    public java.math.BigDecimal getValorUVR() { return valorUVR; }
}
