package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DetallesDiagnostico")
public class DetallesDiagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDetallesDiagnostico", nullable = false)
    private Integer idDetallesDiagnostico;

    @Column(name = "DetallesDiagnostico")
    private String detallesDiagnostico;

    public Integer getIdDetallesDiagnostico() { return idDetallesDiagnostico; }
    public String getDetallesDiagnostico() { return detallesDiagnostico; }
}
