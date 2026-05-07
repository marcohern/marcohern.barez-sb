package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FotosEmpleados")
public class FotosEmpleados {

    @Id
    @Column(name = "IdEmpleado", nullable = false)
    private Integer idEmpleado;

    @Column(name = "Nombre", length = 50)
    private String nombre;

    @Column(name = "Descripcion", length = 255)
    private String descripcion;

    @Column(name = "Fecha")
    private java.time.LocalDateTime fecha;

    public Integer getIdEmpleado() { return idEmpleado; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public java.time.LocalDateTime getFecha() { return fecha; }
}
