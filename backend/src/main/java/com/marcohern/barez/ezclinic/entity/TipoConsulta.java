package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoConsulta")
public class TipoConsulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoConsulta", nullable = false)
    private Integer idTipoConsulta;

    @Column(name = "TipoConsulta", length = 50)
    private String tipoConsulta;

    @Column(name = "Codigo", length = 2)
    private String codigo;

    public Integer getIdTipoConsulta() { return idTipoConsulta; }
    public String getTipoConsulta() { return tipoConsulta; }
    public String getCodigo() { return codigo; }
}
