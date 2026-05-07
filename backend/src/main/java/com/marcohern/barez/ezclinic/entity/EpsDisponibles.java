package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EpsDisponibles")
public class EpsDisponibles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEpsDisponibles", nullable = false)
    private Integer idEpsDisponibles;

    @Column(name = "NombreEps", nullable = false, length = 150)
    private String nombreEps;

    @Column(name = "ValorEps", length = 6)
    private String valorEps;

    public Integer getIdEpsDisponibles() { return idEpsDisponibles; }
    public String getNombreEps() { return nombreEps; }
    public String getValorEps() { return valorEps; }
}
