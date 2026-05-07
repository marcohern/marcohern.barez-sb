package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CausaExterna")
public class CausaExterna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCausaExterna", nullable = false)
    private Integer idCausaExterna;

    @Column(name = "CausaExterna", length = 50)
    private String causaExterna;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Codigo", length = 2)
    private String codigo;

    public Integer getIdCausaExterna() { return idCausaExterna; }
    public String getCausaExterna() { return causaExterna; }
    public String getDescripcion() { return descripcion; }
    public String getCodigo() { return codigo; }
}
