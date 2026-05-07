package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DetallesContactosProveedores")
@IdClass(DetallesContactosProveedoresId.class)
public class DetallesContactosProveedores {

    @Id
    @Column(name = "IdContacto", nullable = false)
    private Integer idContacto;

    @Id
    @Column(name = "IdProveedor", nullable = false)
    private Integer idProveedor;

    @Column(name = "IdNivel")
    private Integer idNivel;

    @Column(name = "Cargo", length = 50)
    private String cargo;

    @Column(name = "Funciones")
    private String funciones;

    @Column(name = "ContactoSuspendido", nullable = false)
    private Boolean contactoSuspendido;

    public Integer getIdContacto() { return idContacto; }
    public Integer getIdProveedor() { return idProveedor; }
    public Integer getIdNivel() { return idNivel; }
    public String getCargo() { return cargo; }
    public String getFunciones() { return funciones; }
    public Boolean getContactoSuspendido() { return contactoSuspendido; }
}
