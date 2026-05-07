package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RiesgosEmpresa")
@IdClass(RiesgosEmpresaId.class)
public class RiesgosEmpresa {

    @Id
    @Column(name = "IdEmpresaPaciente", nullable = false)
    private Integer idEmpresaPaciente;

    @Id
    @Column(name = "IdRiesgo", nullable = false)
    private Integer idRiesgo;

    @Column(name = "TiempoExposicion")
    private Integer tiempoExposicion;

    @Column(name = "IdTiempo")
    private Integer idTiempo;

    @Column(name = "UsoElementosProteccion", nullable = false)
    private Boolean usoElementosProteccion;

    @Column(name = "NivelExposicion", length = 50)
    private String nivelExposicion;

    public Integer getIdEmpresaPaciente() { return idEmpresaPaciente; }
    public Integer getIdRiesgo() { return idRiesgo; }
    public Integer getTiempoExposicion() { return tiempoExposicion; }
    public Integer getIdTiempo() { return idTiempo; }
    public Boolean getUsoElementosProteccion() { return usoElementosProteccion; }
    public String getNivelExposicion() { return nivelExposicion; }
}
