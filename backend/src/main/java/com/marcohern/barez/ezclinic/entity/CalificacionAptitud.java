package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CalificacionAptitud")
public class CalificacionAptitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCalificacion", nullable = false)
    private Integer idCalificacion;

    @Column(name = "Calificacion", length = 100)
    private String calificacion;

    @Column(name = "Activo", nullable = false)
    private Boolean activo;

    public Integer getIdCalificacion() { return idCalificacion; }
    public String getCalificacion() { return calificacion; }
    public Boolean getActivo() { return activo; }
}
