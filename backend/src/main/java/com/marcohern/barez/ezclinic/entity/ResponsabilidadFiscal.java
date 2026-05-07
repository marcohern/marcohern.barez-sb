package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ResponsabilidadFiscal")
public class ResponsabilidadFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdResponsabilidad", nullable = false)
    private Integer idResponsabilidad;

    @Column(name = "Responsabilidad", nullable = false, length = 200)
    private String responsabilidad;

    @Column(name = "Codigo", nullable = false, length = 10)
    private String codigo;

    public Integer getIdResponsabilidad() { return idResponsabilidad; }
    public String getResponsabilidad() { return responsabilidad; }
    public String getCodigo() { return codigo; }
}
