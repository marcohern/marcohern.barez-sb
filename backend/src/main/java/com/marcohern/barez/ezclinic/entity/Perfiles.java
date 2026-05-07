package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Perfiles")
public class Perfiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPerfil", nullable = false)
    private Integer idPerfil;

    @Column(name = "Perfil", nullable = false, length = 200)
    private String perfil;

    @Column(name = "Descripcion", length = 1000)
    private String descripcion;

    @Column(name = "EsPerfil", nullable = false)
    private Boolean esPerfil;

    public Integer getIdPerfil() { return idPerfil; }
    public String getPerfil() { return perfil; }
    public String getDescripcion() { return descripcion; }
    public Boolean getEsPerfil() { return esPerfil; }
}
