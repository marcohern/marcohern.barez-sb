package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Examenes")
public class Examenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdExamen", nullable = false)
    private Integer idExamen;

    @Column(name = "Examen", nullable = false, length = 100)
    private String examen;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdExamen() { return idExamen; }
    public String getExamen() { return examen; }
    public String getDescripcion() { return descripcion; }
    public Boolean getSuspendido() { return suspendido; }
}
