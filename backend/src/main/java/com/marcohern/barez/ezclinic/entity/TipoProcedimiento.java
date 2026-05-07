package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoProcedimiento")
public class TipoProcedimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoProcedimiento", nullable = false)
    private Integer idTipoProcedimiento;

    @Column(name = "TipoProcedimiento", nullable = false, length = 200)
    private String tipoProcedimiento;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "TiempoMin")
    private Float tiempoMin;

    @Column(name = "TiempoMax")
    private Float tiempoMax;

    public Integer getIdTipoProcedimiento() { return idTipoProcedimiento; }
    public String getTipoProcedimiento() { return tipoProcedimiento; }
    public String getDescripcion() { return descripcion; }
    public Integer getIdSexo() { return idSexo; }
    public Float getTiempoMin() { return tiempoMin; }
    public Float getTiempoMax() { return tiempoMax; }
}
