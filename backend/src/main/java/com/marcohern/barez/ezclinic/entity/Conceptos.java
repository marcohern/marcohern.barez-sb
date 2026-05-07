package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Conceptos")
public class Conceptos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdConcepto", nullable = false)
    private Integer idConcepto;

    @Column(name = "Concepto", nullable = false, length = 200)
    private String concepto;

    @Column(name = "Codigo", nullable = false, length = 3)
    private String codigo;

    @Column(name = "IdTipoFactura", nullable = false)
    private Integer idTipoFactura;

    public Integer getIdConcepto() { return idConcepto; }
    public String getConcepto() { return concepto; }
    public String getCodigo() { return codigo; }
    public Integer getIdTipoFactura() { return idTipoFactura; }
}
