package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDepartamento", nullable = false)
    private Integer idDepartamento;

    @Column(name = "IdPais")
    private Integer idPais;

    @Column(name = "Departamento", nullable = false, length = 50)
    private String departamento;

    @Column(name = "ValorDpto", length = 2)
    private String valorDpto;

    public Integer getIdDepartamento() { return idDepartamento; }
    public Integer getIdPais() { return idPais; }
    public String getDepartamento() { return departamento; }
    public String getValorDpto() { return valorDpto; }
}
