package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AntecGinecoObstetricos")
public class AntecGinecoObstetricos {

    @Id
    @Column(name = "IdPaciente", nullable = false)
    private Integer idPaciente;

    @Column(name = "Menarquia")
    private Integer menarquia;

    @Column(name = "Ciclo")
    private Integer ciclo;

    @Column(name = "DuracionCiclo")
    private Integer duracionCiclo;

    @Column(name = "Gestaciones")
    private Integer gestaciones;

    @Column(name = "Partos")
    private Integer partos;

    @Column(name = "Abortos")
    private Integer abortos;

    @Column(name = "Cesareas")
    private Integer cesareas;

    @Column(name = "Vivos")
    private Integer vivos;

    @Column(name = "FechaUltRegla")
    private java.time.LocalDateTime fechaUltRegla;

    @Column(name = "FechaUltParto")
    private java.time.LocalDateTime fechaUltParto;

    @Column(name = "Planificacion")
    private String planificacion;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdPaciente() { return idPaciente; }
    public Integer getMenarquia() { return menarquia; }
    public Integer getCiclo() { return ciclo; }
    public Integer getDuracionCiclo() { return duracionCiclo; }
    public Integer getGestaciones() { return gestaciones; }
    public Integer getPartos() { return partos; }
    public Integer getAbortos() { return abortos; }
    public Integer getCesareas() { return cesareas; }
    public Integer getVivos() { return vivos; }
    public java.time.LocalDateTime getFechaUltRegla() { return fechaUltRegla; }
    public java.time.LocalDateTime getFechaUltParto() { return fechaUltParto; }
    public String getPlanificacion() { return planificacion; }
    public String getObservaciones() { return observaciones; }
}
