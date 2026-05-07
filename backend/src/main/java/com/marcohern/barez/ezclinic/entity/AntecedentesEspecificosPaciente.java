package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AntecedentesEspecificosPaciente")
@IdClass(AntecedentesEspecificosPacienteId.class)
public class AntecedentesEspecificosPaciente {

    @Id
    @Column(name = "IdPaciente", nullable = false)
    private Integer idPaciente;

    @Id
    @Column(name = "IdAntecedente", nullable = false)
    private Integer idAntecedente;

    @Column(name = "Aplica", length = 10)
    private String aplica;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdPaciente() { return idPaciente; }
    public Integer getIdAntecedente() { return idAntecedente; }
    public String getAplica() { return aplica; }
    public String getObservaciones() { return observaciones; }
}
