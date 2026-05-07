package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "NivelOrganizacion")
public class NivelOrganizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdNivel", nullable = false)
    private Integer idNivel;

    @Column(name = "Nivel", length = 50)
    private String nivel;

    @Column(name = "Descripcion", length = 50)
    private String descripcion;

    public Integer getIdNivel() { return idNivel; }
    public String getNivel() { return nivel; }
    public String getDescripcion() { return descripcion; }
}
