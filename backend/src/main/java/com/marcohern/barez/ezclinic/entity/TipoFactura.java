package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoFactura")
public class TipoFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoFactura", nullable = false)
    private Integer idTipoFactura;

    @Column(name = "TipoFactura", nullable = false, length = 50)
    private String tipoFactura;

    @Column(name = "Codigo", nullable = false, length = 2)
    private String codigo;

    @Column(name = "CodigoGrafico", length = 2)
    private String codigoGrafico;

    public Integer getIdTipoFactura() { return idTipoFactura; }
    public String getTipoFactura() { return tipoFactura; }
    public String getCodigo() { return codigo; }
    public String getCodigoGrafico() { return codigoGrafico; }
}
