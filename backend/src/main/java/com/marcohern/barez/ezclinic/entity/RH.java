package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RH")
public class RH {

    @Column(name = "IdRH", nullable = false)
    private Integer idRH;

    @Id
    @Column(name = "RH", nullable = false, length = 5)
    private String rH;

    @Column(name = "Descripcion", length = 255)
    private String descripcion;

    public Integer getIdRH() { return idRH; }
    public String getRH() { return rH; }
    public String getDescripcion() { return descripcion; }
}
