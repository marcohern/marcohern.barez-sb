package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ControlesPlanSalud")
@IdClass(ControlesPlanSaludId.class)
public class ControlesPlanSalud {

    @Id
    @Column(name = "IdPlanSalud", nullable = false)
    private Integer idPlanSalud;

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "IdTipoPago", nullable = false)
    private Integer idTipoPago;

    @Column(name = "Valor1")
    private Integer valor1;

    @Column(name = "Valor2")
    private Double valor2;

    @Column(name = "Valor3")
    private Double valor3;

    @Column(name = "Valor4")
    private Double valor4;

    public Integer getIdPlanSalud() { return idPlanSalud; }
    public Integer getIdServicio() { return idServicio; }
    public Integer getIdTipoPago() { return idTipoPago; }
    public Integer getValor1() { return valor1; }
    public Double getValor2() { return valor2; }
    public Double getValor3() { return valor3; }
    public Double getValor4() { return valor4; }
}
