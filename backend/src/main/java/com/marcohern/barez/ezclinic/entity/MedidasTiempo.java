package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "MedidasTiempo")
public class MedidasTiempo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTiempo", nullable = false)
    private Integer idTiempo;

    @Column(name = "Tiempo", length = 100)
    private String tiempo;

    public Integer getIdTiempo() { return idTiempo; }
    public String getTiempo() { return tiempo; }
}
