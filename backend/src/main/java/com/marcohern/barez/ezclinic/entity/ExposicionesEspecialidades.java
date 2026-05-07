package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ExposicionesEspecialidades")
@IdClass(ExposicionesEspecialidadesId.class)
public class ExposicionesEspecialidades {

    @Id
    @Column(name = "IdExposicion", nullable = false)
    private Integer idExposicion;

    @Id
    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    @Column(name = "NumOrden")
    private Integer numOrden;

    @Column(name = "EspecialidadSuspendida", nullable = false)
    private Boolean especialidadSuspendida;

    public Integer getIdExposicion() { return idExposicion; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
    public Integer getNumOrden() { return numOrden; }
    public Boolean getEspecialidadSuspendida() { return especialidadSuspendida; }
}
