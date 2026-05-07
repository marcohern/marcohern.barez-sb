package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FacturacionVirtualEPS")
public class FacturacionVirtualEPS {

    @Column(name = "IdDependencia", nullable = false)
    private Integer idDependencia;

    @Column(name = "IdEPS", nullable = false)
    private Integer idEPS;

    @Column(name = "NumFacturaVirtual")
    private Integer numFacturaVirtual;

    @Column(name = "FechaFacturaVirtual")
    private java.time.LocalDateTime fechaFacturaVirtual;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFactura", nullable = false)
    private Integer idFactura;

    @Column(name = "ConsecutivoRemision")
    private Integer consecutivoRemision;

    @Column(name = "IdMedico")
    private Integer idMedico;

    @Column(name = "FechaGeneracion")
    private java.time.LocalDateTime fechaGeneracion;

    @Column(name = "FechaInicial")
    private java.time.LocalDateTime fechaInicial;

    @Column(name = "FechaFinal")
    private java.time.LocalDateTime fechaFinal;

    @Column(name = "TotalRegistros")
    private Integer totalRegistros;

    @Column(name = "ValorFactura")
    private java.math.BigDecimal valorFactura;

    @Column(name = "TotalServicios")
    private java.math.BigDecimal totalServicios;

    @Column(name = "PagoCapitacion")
    private Boolean pagoCapitacion;

    @Column(name = "FechaVencimiento")
    private java.time.LocalDateTime fechaVencimiento;

    @Column(name = "Saldo")
    private java.math.BigDecimal saldo;

    @Column(name = "IdEstado")
    private Integer idEstado;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "BotonPago")
    private String botonPago;

    public Integer getIdDependencia() { return idDependencia; }
    public Integer getIdEPS() { return idEPS; }
    public Integer getNumFacturaVirtual() { return numFacturaVirtual; }
    public java.time.LocalDateTime getFechaFacturaVirtual() { return fechaFacturaVirtual; }
    public Integer getIdFactura() { return idFactura; }
    public Integer getConsecutivoRemision() { return consecutivoRemision; }
    public Integer getIdMedico() { return idMedico; }
    public java.time.LocalDateTime getFechaGeneracion() { return fechaGeneracion; }
    public java.time.LocalDateTime getFechaInicial() { return fechaInicial; }
    public java.time.LocalDateTime getFechaFinal() { return fechaFinal; }
    public Integer getTotalRegistros() { return totalRegistros; }
    public java.math.BigDecimal getValorFactura() { return valorFactura; }
    public java.math.BigDecimal getTotalServicios() { return totalServicios; }
    public Boolean getPagoCapitacion() { return pagoCapitacion; }
    public java.time.LocalDateTime getFechaVencimiento() { return fechaVencimiento; }
    public java.math.BigDecimal getSaldo() { return saldo; }
    public Integer getIdEstado() { return idEstado; }
    public String getObservaciones() { return observaciones; }
    public String getBotonPago() { return botonPago; }
}
