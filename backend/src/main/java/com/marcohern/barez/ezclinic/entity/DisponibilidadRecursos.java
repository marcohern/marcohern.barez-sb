package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

// NOTE: source table has no primary key. Synthetic IdClass composed of all non-nullable columns.
// Rows containing NULLs across all candidate-id columns may be unfetchable via JPA.
@Entity
@Immutable
@Table(name = "DisponibilidadRecursos")
@IdClass(DisponibilidadRecursosId.class)
public class DisponibilidadRecursos {

    @Id
    @Column(name = "IdRecurso", nullable = false)
    private Integer idRecurso;

    @Column(name = "DiaSemana", length = 50)
    private String diaSemana;

    @Column(name = "HoraInicial")
    private java.time.LocalDateTime horaInicial;

    @Column(name = "HoraFinal")
    private java.time.LocalDateTime horaFinal;

    @Column(name = "IntervaloCitas", length = 50)
    private String intervaloCitas;

    @Id
    @Column(name = "HorarioSuspendido", nullable = false)
    private Boolean horarioSuspendido;

    public Integer getIdRecurso() { return idRecurso; }
    public String getDiaSemana() { return diaSemana; }
    public java.time.LocalDateTime getHoraInicial() { return horaInicial; }
    public java.time.LocalDateTime getHoraFinal() { return horaFinal; }
    public String getIntervaloCitas() { return intervaloCitas; }
    public Boolean getHorarioSuspendido() { return horarioSuspendido; }
}
