package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "MotivoExamen")
public class MotivoExamen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMotivo", nullable = false)
    private Integer idMotivo;

    @Column(name = "Motivo", length = 100)
    private String motivo;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdMotivo() { return idMotivo; }
    public String getMotivo() { return motivo; }
    public Boolean getSuspendido() { return suspendido; }
}
