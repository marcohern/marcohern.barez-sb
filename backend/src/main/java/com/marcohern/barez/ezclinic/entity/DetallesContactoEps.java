package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DetallesContactoEps")
@IdClass(DetallesContactoEpsId.class)
public class DetallesContactoEps {

    @Id
    @Column(name = "IdContacto", nullable = false)
    private Integer idContacto;

    @Id
    @Column(name = "IdEPS", nullable = false)
    private Integer idEPS;

    @Column(name = "IdNivel")
    private Integer idNivel;

    @Column(name = "Cargo", length = 50)
    private String cargo;

    @Column(name = "Funciones")
    private String funciones;

    @Column(name = "ContactoSuspendido", nullable = false)
    private Boolean contactoSuspendido;

    @Column(name = "CorreoCorporativo", length = 100)
    private String correoCorporativo;

    public Integer getIdContacto() { return idContacto; }
    public Integer getIdEPS() { return idEPS; }
    public Integer getIdNivel() { return idNivel; }
    public String getCargo() { return cargo; }
    public String getFunciones() { return funciones; }
    public Boolean getContactoSuspendido() { return contactoSuspendido; }
    public String getCorreoCorporativo() { return correoCorporativo; }
}
