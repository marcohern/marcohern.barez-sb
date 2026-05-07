package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ArchivosSolicitudes")
@IdClass(ArchivosSolicitudesId.class)
public class ArchivosSolicitudes {

    @Id
    @Column(name = "IdArchivo", nullable = false)
    private Long idArchivo;

    @Id
    @Column(name = "IdSolicitud", nullable = false)
    private Long idSolicitud;

    @Column(name = "Cantidad", nullable = false)
    private Short cantidad;

    public Long getIdArchivo() { return idArchivo; }
    public Long getIdSolicitud() { return idSolicitud; }
    public Short getCantidad() { return cantidad; }
}
