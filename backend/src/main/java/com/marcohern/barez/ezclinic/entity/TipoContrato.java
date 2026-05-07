package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoContrato")
public class TipoContrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdContrato", nullable = false)
    private Integer idContrato;

    @Column(name = "TipoContrato", length = 70)
    private String tipoContrato;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdContrato() { return idContrato; }
    public String getTipoContrato() { return tipoContrato; }
    public String getObservaciones() { return observaciones; }
}
