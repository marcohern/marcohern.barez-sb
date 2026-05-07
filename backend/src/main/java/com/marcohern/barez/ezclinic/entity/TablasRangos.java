package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TablasRangos")
public class TablasRangos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTabla", nullable = false)
    private Integer idTabla;

    @Column(name = "NombreTabla", nullable = false, length = 50)
    private String nombreTabla;

    @Column(name = "Fecha")
    private java.time.LocalDateTime fecha;

    public Integer getIdTabla() { return idTabla; }
    public String getNombreTabla() { return nombreTabla; }
    public java.time.LocalDateTime getFecha() { return fecha; }
}
