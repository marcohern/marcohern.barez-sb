package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ModalidadAtencion")
public class ModalidadAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdModalidad", nullable = false)
    private Integer idModalidad;

    @Column(name = "Modalidad", nullable = false, length = 50)
    private String modalidad;

    @Column(name = "Codigo", length = 2)
    private String codigo;

    public Integer getIdModalidad() { return idModalidad; }
    public String getModalidad() { return modalidad; }
    public String getCodigo() { return codigo; }
}
