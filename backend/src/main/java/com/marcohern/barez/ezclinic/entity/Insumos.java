package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Insumos")
public class Insumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdInsumo", nullable = false)
    private Integer idInsumo;

    @Column(name = "NomProd", nullable = false, length = 150)
    private String nomProd;

    @Column(name = "Descripcion", length = 50)
    private String descripcion;

    @Column(name = "CodAnatomo", length = 50)
    private String codAnatomo;

    @Column(name = "CodAdmon", length = 50)
    private String codAdmon;

    @Column(name = "Forma", length = 2)
    private String forma;

    @Column(name = "Concentracion", length = 1)
    private String concentracion;

    @Column(name = "UniMedida", length = 100)
    private String uniMedida;

    @Column(name = "ExisMax", nullable = false)
    private Integer exisMax;

    @Column(name = "ExisMin", nullable = false)
    private Integer exisMin;

    @Column(name = "InsumoSuspendido", nullable = false)
    private Boolean insumoSuspendido;

    public Integer getIdInsumo() { return idInsumo; }
    public String getNomProd() { return nomProd; }
    public String getDescripcion() { return descripcion; }
    public String getCodAnatomo() { return codAnatomo; }
    public String getCodAdmon() { return codAdmon; }
    public String getForma() { return forma; }
    public String getConcentracion() { return concentracion; }
    public String getUniMedida() { return uniMedida; }
    public Integer getExisMax() { return exisMax; }
    public Integer getExisMin() { return exisMin; }
    public Boolean getInsumoSuspendido() { return insumoSuspendido; }
}
