package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DetalleTributacion")
public class DetalleTributacion {

    @Column(name = "IdDetalleTributo", nullable = false)
    private Long idDetalleTributo;

    @Id
    @Column(name = "IdDetalle", nullable = false)
    private Long idDetalle;

    @Column(name = "IdTributo", nullable = false)
    private Integer idTributo;

    @Column(name = "Consecutivo", nullable = false)
    private Short consecutivo;

    public Long getIdDetalleTributo() { return idDetalleTributo; }
    public Long getIdDetalle() { return idDetalle; }
    public Integer getIdTributo() { return idTributo; }
    public Short getConsecutivo() { return consecutivo; }
}
