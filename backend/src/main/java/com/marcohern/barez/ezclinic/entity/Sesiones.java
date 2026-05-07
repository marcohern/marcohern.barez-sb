package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Sesiones")
public class Sesiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSesion", nullable = false)
    private Integer idSesion;

    @Column(name = "IdRegistro")
    private Integer idRegistro;

    @Column(name = "Maquina", length = 200)
    private String maquina;

    @Column(name = "IdUser", length = 200)
    private String idUser;

    @Column(name = "ProcessId")
    private Integer processId;

    @Column(name = "Login", length = 200)
    private String login;

    @Column(name = "FechaInicio")
    private java.time.LocalDateTime fechaInicio;

    @Column(name = "FechaActualizacion")
    private java.time.LocalDateTime fechaActualizacion;

    public Integer getIdSesion() { return idSesion; }
    public Integer getIdRegistro() { return idRegistro; }
    public String getMaquina() { return maquina; }
    public String getIdUser() { return idUser; }
    public Integer getProcessId() { return processId; }
    public String getLogin() { return login; }
    public java.time.LocalDateTime getFechaInicio() { return fechaInicio; }
    public java.time.LocalDateTime getFechaActualizacion() { return fechaActualizacion; }
}
