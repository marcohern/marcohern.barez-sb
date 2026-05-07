package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoExposicion")
public class TipoExposicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoExposicion", nullable = false)
    private Integer idTipoExposicion;

    @Column(name = "TipoExposicion", length = 100)
    private String tipoExposicion;

    public Integer getIdTipoExposicion() { return idTipoExposicion; }
    public String getTipoExposicion() { return tipoExposicion; }
}
