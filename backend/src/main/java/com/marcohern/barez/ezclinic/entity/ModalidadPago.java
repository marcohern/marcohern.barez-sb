package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ModalidadPago")
public class ModalidadPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdModalidad", nullable = false)
    private Short idModalidad;

    @Column(name = "Codigo", nullable = false, length = 2)
    private String codigo;

    @Column(name = "Modalidad", nullable = false, length = 100)
    private String modalidad;

    public Short getIdModalidad() { return idModalidad; }
    public String getCodigo() { return codigo; }
    public String getModalidad() { return modalidad; }
}
