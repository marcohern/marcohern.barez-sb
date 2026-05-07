package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FotosHClinica")
public class FotosHClinica {

    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "Nombre", length = 50)
    private String nombre;

    @Column(name = "Descripcion", length = 255)
    private String descripcion;

    @Column(name = "Fecha")
    private java.time.LocalDateTime fecha;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFoto", nullable = false)
    private Integer idFoto;

    public Integer getIdAuto() { return idAuto; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public java.time.LocalDateTime getFecha() { return fecha; }
    public Integer getIdFoto() { return idFoto; }
}
