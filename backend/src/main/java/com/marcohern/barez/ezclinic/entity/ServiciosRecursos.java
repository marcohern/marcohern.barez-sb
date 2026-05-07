package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ServiciosRecursos")
@IdClass(ServiciosRecursosId.class)
public class ServiciosRecursos {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdRecurso", nullable = false)
    private Integer idRecurso;

    @Column(name = "ArriendoRecurso")
    private java.math.BigDecimal arriendoRecurso;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdRecurso() { return idRecurso; }
    public java.math.BigDecimal getArriendoRecurso() { return arriendoRecurso; }
}
