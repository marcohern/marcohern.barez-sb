package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoDiagnostico")
public class TipoDiagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoDiagnostico", nullable = false)
    private Integer idTipoDiagnostico;

    @Column(name = "TipoDiagnostico", length = 50)
    private String tipoDiagnostico;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdTipoDiagnostico() { return idTipoDiagnostico; }
    public String getTipoDiagnostico() { return tipoDiagnostico; }
    public String getDescripcion() { return descripcion; }
}
