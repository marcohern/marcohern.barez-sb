package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Fabricantes")
public class Fabricantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFabricante", nullable = false)
    private Integer idFabricante;

    @Column(name = "Fabricante", nullable = false, length = 150)
    private String fabricante;

    public Integer getIdFabricante() { return idFabricante; }
    public String getFabricante() { return fabricante; }
}
