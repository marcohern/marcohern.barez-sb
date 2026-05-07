package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ExamenesSolicitudes")
@IdClass(ExamenesSolicitudesId.class)
public class ExamenesSolicitudes {

    @Id
    @Column(name = "IdExamen", nullable = false)
    private Integer idExamen;

    @Id
    @Column(name = "IdSolicitud", nullable = false)
    private Long idSolicitud;

    @Column(name = "Cantidad", nullable = false)
    private Short cantidad;

    public Integer getIdExamen() { return idExamen; }
    public Long getIdSolicitud() { return idSolicitud; }
    public Short getCantidad() { return cantidad; }
}
