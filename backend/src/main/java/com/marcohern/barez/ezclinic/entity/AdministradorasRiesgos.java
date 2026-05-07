package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AdministradorasRiesgos")
public class AdministradorasRiesgos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdARP", nullable = false)
    private Integer idARP;

    @Column(name = "Administradora", length = 200)
    private String administradora;

    @Column(name = "CodARP", length = 10)
    private String codARP;

    public Integer getIdARP() { return idARP; }
    public String getAdministradora() { return administradora; }
    public String getCodARP() { return codARP; }
}
