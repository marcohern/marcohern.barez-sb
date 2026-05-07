package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoUsuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoUsuario", nullable = false)
    private Integer idTipoUsuario;

    @Column(name = "TipoUsuario", length = 100)
    private String tipoUsuario;

    public Integer getIdTipoUsuario() { return idTipoUsuario; }
    public String getTipoUsuario() { return tipoUsuario; }
}
