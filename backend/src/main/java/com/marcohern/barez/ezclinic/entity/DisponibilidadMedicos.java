package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

// NOTE: source table has no primary key. Synthetic IdClass composed of all non-nullable columns.
// Rows containing NULLs across all candidate-id columns may be unfetchable via JPA.
@Entity
@Immutable
@Table(name = "DisponibilidadMedicos")
@IdClass(DisponibilidadMedicosId.class)
public class DisponibilidadMedicos {

    @Id
    @Column(name = "IdMedico", nullable = false)
    private Integer idMedico;

    @Id
    @Column(name = "IdClasificacion", nullable = false)
    private Integer idClasificacion;

    @Column(name = "IdEspecialidad")
    private Integer idEspecialidad;

    @Column(name = "DiaSemana", length = 50)
    private String diaSemana;

    @Column(name = "HoraEntrada")
    private java.time.LocalDateTime horaEntrada;

    @Column(name = "HoraSalida")
    private java.time.LocalDateTime horaSalida;

    @Column(name = "IntervaloCitas", length = 50)
    private String intervaloCitas;

    @Id
    @Column(name = "HorarioSuspendido", nullable = false)
    private Boolean horarioSuspendido;

    public Integer getIdMedico() { return idMedico; }
    public Integer getIdClasificacion() { return idClasificacion; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
    public String getDiaSemana() { return diaSemana; }
    public java.time.LocalDateTime getHoraEntrada() { return horaEntrada; }
    public java.time.LocalDateTime getHoraSalida() { return horaSalida; }
    public String getIntervaloCitas() { return intervaloCitas; }
    public Boolean getHorarioSuspendido() { return horarioSuspendido; }
}
