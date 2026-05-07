package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ServiciosPlanSalud")
@IdClass(ServiciosPlanSaludId.class)
public class ServiciosPlanSalud {

    @Id
    @Column(name = "IdPlanSalud", nullable = false)
    private Integer idPlanSalud;

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "TiempoValido", length = 50)
    private String tiempoValido;

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

    @Column(name = "TarifaIntegral", nullable = false)
    private Boolean tarifaIntegral;

    @Column(name = "FacturarMedico", nullable = false)
    private Boolean facturarMedico;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    @Column(name = "Alias", length = 255)
    private String alias;

    public Integer getIdPlanSalud() { return idPlanSalud; }
    public Integer getIdServicio() { return idServicio; }
    public String getTiempoValido() { return tiempoValido; }
    public Integer getIdTipoPago() { return idTipoPago; }
    public Integer getValor1() { return valor1; }
    public Double getValor2() { return valor2; }
    public Double getValor3() { return valor3; }
    public Double getValor4() { return valor4; }
    public Boolean getTarifaIntegral() { return tarifaIntegral; }
    public Boolean getFacturarMedico() { return facturarMedico; }
    public Boolean getSuspendido() { return suspendido; }
    public String getAlias() { return alias; }
}
