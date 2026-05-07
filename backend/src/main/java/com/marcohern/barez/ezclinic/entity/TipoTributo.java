package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoTributo")
public class TipoTributo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTributo", nullable = false)
    private Integer idTributo;

    @Column(name = "Tributo", nullable = false, length = 200)
    private String tributo;

    @Column(name = "Descripcion", nullable = false, length = 4000)
    private String descripcion;

    @Column(name = "Codigo", nullable = false, length = 2)
    private String codigo;

    public Integer getIdTributo() { return idTributo; }
    public String getTributo() { return tributo; }
    public String getDescripcion() { return descripcion; }
    public String getCodigo() { return codigo; }
}
