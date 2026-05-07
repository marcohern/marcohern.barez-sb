package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ViaIngreso")
public class ViaIngreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdViaIngreso", nullable = false)
    private Integer idViaIngreso;

    @Column(name = "ViaIngreso", length = 50)
    private String viaIngreso;

    @Column(name = "Codigo", length = 2)
    private String codigo;

    public Integer getIdViaIngreso() { return idViaIngreso; }
    public String getViaIngreso() { return viaIngreso; }
    public String getCodigo() { return codigo; }
}
