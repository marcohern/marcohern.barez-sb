package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ContratosMedicos")
public class ContratosMedicos {

    @Id
    @Column(name = "IdMedico", nullable = false)
    private Integer idMedico;

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

    @Column(name = "REPSS", length = 10)
    private String rEPSS;

    @Column(name = "ResolucionDIAN", length = 50)
    private String resolucionDIAN;

    @Column(name = "FechaDIAN")
    private java.time.LocalDateTime fechaDIAN;

    @Column(name = "ReciboInicio")
    private Integer reciboInicio;

    @Column(name = "ReciboFinal")
    private Integer reciboFinal;

    @Column(name = "NumFactura")
    private Integer numFactura;

    public Integer getIdMedico() { return idMedico; }
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
    public String getREPSS() { return rEPSS; }
    public String getResolucionDIAN() { return resolucionDIAN; }
    public java.time.LocalDateTime getFechaDIAN() { return fechaDIAN; }
    public Integer getReciboInicio() { return reciboInicio; }
    public Integer getReciboFinal() { return reciboFinal; }
    public Integer getNumFactura() { return numFactura; }
}
