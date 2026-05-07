package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ClaseProcedimiento")
public class ClaseProcedimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdClaseProcedimiento", nullable = false)
    private Integer idClaseProcedimiento;

    @Column(name = "ClaseProcedimiento", length = 30)
    private String claseProcedimiento;

    @Column(name = "Descripcion")
    private String descripcion;

    public Integer getIdClaseProcedimiento() { return idClaseProcedimiento; }
    public String getClaseProcedimiento() { return claseProcedimiento; }
    public String getDescripcion() { return descripcion; }
}
