package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EmpresasPaciente")
public class EmpresasPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaPaciente", nullable = false)
    private Integer idEmpresaPaciente;

    @Column(name = "IdPaciente")
    private Integer idPaciente;

    @Column(name = "IdEmpresa")
    private Integer idEmpresa;

    @Column(name = "IdCargo")
    private Integer idCargo;

    @Column(name = "TiempoExposicion")
    private Integer tiempoExposicion;

    @Column(name = "IdTiempo")
    private Integer idTiempo;

    @Column(name = "Funciones", length = 255)
    private String funciones;

    public Integer getIdEmpresaPaciente() { return idEmpresaPaciente; }
    public Integer getIdPaciente() { return idPaciente; }
    public Integer getIdEmpresa() { return idEmpresa; }
    public Integer getIdCargo() { return idCargo; }
    public Integer getTiempoExposicion() { return tiempoExposicion; }
    public Integer getIdTiempo() { return idTiempo; }
    public String getFunciones() { return funciones; }
}
