package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ExposicionesPaciente")
@IdClass(ExposicionesPacienteId.class)
public class ExposicionesPaciente {

    @Id
    @Column(name = "IdPaciente", nullable = false)
    private Integer idPaciente;

    @Id
    @Column(name = "IdExposicion", nullable = false)
    private Integer idExposicion;

    @Column(name = "Tiempo", length = 50)
    private String tiempo;

    @Column(name = "Intensidad", length = 50)
    private String intensidad;

    @Column(name = "EPP", length = 50)
    private String ePP;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdPaciente() { return idPaciente; }
    public Integer getIdExposicion() { return idExposicion; }
    public String getTiempo() { return tiempo; }
    public String getIntensidad() { return intensidad; }
    public String getEPP() { return ePP; }
    public String getObservaciones() { return observaciones; }
}
