package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RecomendacionesCIE10")
@IdClass(RecomendacionesCIE10Id.class)
public class RecomendacionesCIE10 {

    @Id
    @Column(name = "IdDiagnostico", nullable = false)
    private Integer idDiagnostico;

    @Id
    @Column(name = "IdRecomendacion", nullable = false)
    private Integer idRecomendacion;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdDiagnostico() { return idDiagnostico; }
    public Integer getIdRecomendacion() { return idRecomendacion; }
    public Boolean getSuspendido() { return suspendido; }
}
