package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AntecedentesEspecialidades")
@IdClass(AntecedentesEspecialidadesId.class)
public class AntecedentesEspecialidades {

    @Id
    @Column(name = "IdAntecedente", nullable = false)
    private Integer idAntecedente;

    @Id
    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    @Column(name = "NumOrden")
    private Integer numOrden;

    @Column(name = "EspecialidadSuspendida", nullable = false)
    private Boolean especialidadSuspendida;

    public Integer getIdAntecedente() { return idAntecedente; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
    public Integer getNumOrden() { return numOrden; }
    public Boolean getEspecialidadSuspendida() { return especialidadSuspendida; }
}
