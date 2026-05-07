package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoPago")
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoPago", nullable = false)
    private Integer idTipoPago;

    @Column(name = "TipoPago", length = 100)
    private String tipoPago;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdTipoPago() { return idTipoPago; }
    public String getTipoPago() { return tipoPago; }
    public String getObservaciones() { return observaciones; }
}
