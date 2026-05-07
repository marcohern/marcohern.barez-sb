package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ServicioPadre")
@IdClass(ServicioPadreId.class)
public class ServicioPadre {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdAuto1", nullable = false)
    private Integer idAuto1;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdAuto1() { return idAuto1; }
}
