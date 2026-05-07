package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RecomendacionesEspecialidades")
public class RecomendacionesEspecialidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRecomendacion", nullable = false)
    private Integer idRecomendacion;

    @Column(name = "IdEspecialidad", nullable = false)
    private Integer idEspecialidad;

    @Column(name = "Recomendacion", nullable = false)
    private String recomendacion;

    @Column(name = "Ordinal", nullable = false)
    private Integer ordinal;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdRecomendacion() { return idRecomendacion; }
    public Integer getIdEspecialidad() { return idEspecialidad; }
    public String getRecomendacion() { return recomendacion; }
    public Integer getOrdinal() { return ordinal; }
    public Boolean getSuspendido() { return suspendido; }
}
