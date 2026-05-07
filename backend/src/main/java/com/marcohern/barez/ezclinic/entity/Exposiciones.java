package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Exposiciones")
public class Exposiciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdExposicion", nullable = false)
    private Integer idExposicion;

    @Column(name = "IdTipoExposicion")
    private Integer idTipoExposicion;

    @Column(name = "Exposicion", length = 200)
    private String exposicion;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdExposicion() { return idExposicion; }
    public Integer getIdTipoExposicion() { return idTipoExposicion; }
    public String getExposicion() { return exposicion; }
    public Boolean getSuspendido() { return suspendido; }
}
