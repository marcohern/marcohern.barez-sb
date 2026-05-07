package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TrabajadoresSolicitudes")
public class TrabajadoresSolicitudes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTrabajador", nullable = false)
    private Integer idTrabajador;

    @Column(name = "IdSolicitud", nullable = false)
    private Long idSolicitud;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "IdTipoIdentificacion")
    private Integer idTipoIdentificacion;

    @Column(name = "Identificacion", nullable = false, length = 50)
    private String identificacion;

    @Column(name = "Cargo", length = 100)
    private String cargo;

    @Column(name = "IdMotivoExamen", nullable = false)
    private Integer idMotivoExamen;

    @Column(name = "Telefono", length = 20)
    private String telefono;

    @Column(name = "Email", length = 50)
    private String email;

    public Integer getIdTrabajador() { return idTrabajador; }
    public Long getIdSolicitud() { return idSolicitud; }
    public String getNombre() { return nombre; }
    public Integer getIdTipoIdentificacion() { return idTipoIdentificacion; }
    public String getIdentificacion() { return identificacion; }
    public String getCargo() { return cargo; }
    public Integer getIdMotivoExamen() { return idMotivoExamen; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
}
