package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ArchivosAbonosFactura")
@IdClass(ArchivosAbonosFacturaId.class)
public class ArchivosAbonosFactura {

    @Id
    @Column(name = "IdArchivo", nullable = false)
    private Long idArchivo;

    @Id
    @Column(name = "IdAbono", nullable = false)
    private Integer idAbono;

    @Column(name = "Cantidad", nullable = false)
    private Short cantidad;

    public Long getIdArchivo() { return idArchivo; }
    public Integer getIdAbono() { return idAbono; }
    public Short getCantidad() { return cantidad; }
}
