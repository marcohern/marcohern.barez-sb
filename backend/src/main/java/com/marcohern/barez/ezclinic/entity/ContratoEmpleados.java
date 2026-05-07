package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ContratoEmpleados")
public class ContratoEmpleados {

    @Id
    @Column(name = "IdEmpleado", nullable = false)
    private Integer idEmpleado;

    @Column(name = "AfiliadoIPS", nullable = false)
    private Boolean afiliadoIPS;

    @Column(name = "FechaContrato")
    private java.time.LocalDateTime fechaContrato;

    @Column(name = "VigenciaContrato", length = 50)
    private String vigenciaContrato;

    @Column(name = "ContratoSuspendido", nullable = false)
    private Boolean contratoSuspendido;

    @Column(name = "IdContrato")
    private Integer idContrato;

    @Column(name = "Valor1", length = 50)
    private String valor1;

    @Column(name = "Valor2", length = 50)
    private String valor2;

    @Column(name = "Valor3", length = 50)
    private String valor3;

    @Column(name = "Valor4", length = 50)
    private String valor4;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdEmpleado() { return idEmpleado; }
    public Boolean getAfiliadoIPS() { return afiliadoIPS; }
    public java.time.LocalDateTime getFechaContrato() { return fechaContrato; }
    public String getVigenciaContrato() { return vigenciaContrato; }
    public Boolean getContratoSuspendido() { return contratoSuspendido; }
    public Integer getIdContrato() { return idContrato; }
    public String getValor1() { return valor1; }
    public String getValor2() { return valor2; }
    public String getValor3() { return valor3; }
    public String getValor4() { return valor4; }
    public String getObservaciones() { return observaciones; }
}
