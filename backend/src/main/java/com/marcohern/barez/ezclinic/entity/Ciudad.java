package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCiudad", nullable = false)
    private Integer idCiudad;

    @Column(name = "IdDepartamento")
    private Integer idDepartamento;

    @Column(name = "Ciudad", nullable = false, length = 100)
    private String ciudad;

    @Column(name = "ValorCiudad", length = 3)
    private String valorCiudad;

    @Column(name = "EsUrbano", nullable = false)
    private Boolean esUrbano;

    @Column(name = "EsRural", nullable = false)
    private Boolean esRural;

    public Integer getIdCiudad() { return idCiudad; }
    public Integer getIdDepartamento() { return idDepartamento; }
    public String getCiudad() { return ciudad; }
    public String getValorCiudad() { return valorCiudad; }
    public Boolean getEsUrbano() { return esUrbano; }
    public Boolean getEsRural() { return esRural; }
}
