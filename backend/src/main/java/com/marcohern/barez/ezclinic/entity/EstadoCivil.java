package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EstadoCivil")
public class EstadoCivil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEstadoCivil", nullable = false)
    private Integer idEstadoCivil;

    @Column(name = "EstadoCivil", nullable = false, length = 20)
    private String estadoCivil;

    @Column(name = "ValorRia", length = 2)
    private String valorRia;

    public Integer getIdEstadoCivil() { return idEstadoCivil; }
    public String getEstadoCivil() { return estadoCivil; }
    public String getValorRia() { return valorRia; }
}
