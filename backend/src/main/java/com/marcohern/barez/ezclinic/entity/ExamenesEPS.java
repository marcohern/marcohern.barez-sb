package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ExamenesEPS")
@IdClass(ExamenesEPSId.class)
public class ExamenesEPS {

    @Id
    @Column(name = "IdEPS", nullable = false)
    private Integer idEPS;

    @Id
    @Column(name = "IdExamen", nullable = false)
    private Integer idExamen;

    public Integer getIdEPS() { return idEPS; }
    public Integer getIdExamen() { return idExamen; }
}
