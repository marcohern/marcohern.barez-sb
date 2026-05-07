package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "PerfilesContacto")
@IdClass(PerfilesContactoId.class)
public class PerfilesContacto {

    @Id
    @Column(name = "IdContacto", nullable = false)
    private Integer idContacto;

    @Id
    @Column(name = "IdEPS", nullable = false)
    private Integer idEPS;

    @Id
    @Column(name = "IdPerfil", nullable = false)
    private Integer idPerfil;

    public Integer getIdContacto() { return idContacto; }
    public Integer getIdEPS() { return idEPS; }
    public Integer getIdPerfil() { return idPerfil; }
}
