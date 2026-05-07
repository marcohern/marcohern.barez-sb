package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Empresas")
public class Empresas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresa", nullable = false)
    private Integer idEmpresa;

    @Column(name = "Empresa", length = 100)
    private String empresa;

    @Column(name = "IdActividad")
    private Integer idActividad;

    public Integer getIdEmpresa() { return idEmpresa; }
    public String getEmpresa() { return empresa; }
    public Integer getIdActividad() { return idActividad; }
}
