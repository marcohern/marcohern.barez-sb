package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoTarifa")
public class TipoTarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoTarifa", nullable = false)
    private Integer idTipoTarifa;

    @Column(name = "TipoTarifa", length = 20)
    private String tipoTarifa;

    public Integer getIdTipoTarifa() { return idTipoTarifa; }
    public String getTipoTarifa() { return tipoTarifa; }
}
