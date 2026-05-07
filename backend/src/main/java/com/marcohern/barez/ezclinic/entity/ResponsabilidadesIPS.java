package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ResponsabilidadesIPS")
@IdClass(ResponsabilidadesIPSId.class)
public class ResponsabilidadesIPS {

    @Id
    @Column(name = "IdIPS", nullable = false)
    private Integer idIPS;

    @Id
    @Column(name = "IdResponsabilidad", nullable = false)
    private Integer idResponsabilidad;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdIPS() { return idIPS; }
    public Integer getIdResponsabilidad() { return idResponsabilidad; }
    public Boolean getSuspendido() { return suspendido; }
}
