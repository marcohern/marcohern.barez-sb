package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RecomendacionesHistoria")
@IdClass(RecomendacionesHistoriaId.class)
public class RecomendacionesHistoria {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdRecomendacion", nullable = false)
    private Integer idRecomendacion;

    @Column(name = "Ordinal", nullable = false)
    private Integer ordinal;

    @Column(name = "IdTipoRecomendacion")
    private Integer idTipoRecomendacion;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdRecomendacion() { return idRecomendacion; }
    public Integer getOrdinal() { return ordinal; }
    public Integer getIdTipoRecomendacion() { return idTipoRecomendacion; }
}
