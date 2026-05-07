package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoOrden")
public class TipoOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoOrden", nullable = false)
    private Integer idTipoOrden;

    @Column(name = "TipoOrden", length = 50)
    private String tipoOrden;

    public Integer getIdTipoOrden() { return idTipoOrden; }
    public String getTipoOrden() { return tipoOrden; }
}
