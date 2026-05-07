package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoLesion")
public class TipoLesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoLesion", nullable = false)
    private Integer idTipoLesion;

    @Column(name = "TipoLesion", length = 100)
    private String tipoLesion;

    public Integer getIdTipoLesion() { return idTipoLesion; }
    public String getTipoLesion() { return tipoLesion; }
}
