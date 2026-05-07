package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Facturacion")
public class Facturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFactura", nullable = false)
    private Integer idFactura;

    @Column(name = "NumeroFactura")
    private Integer numeroFactura;

    @Column(name = "ConsecutivoRemision", nullable = false)
    private Integer consecutivoRemision;

    @Column(name = "IdEps")
    private Integer idEps;

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

    @Column(name = "IdTipoFactura")
    private Integer idTipoFactura;

    @Column(name = "IdFormaPago")
    private Integer idFormaPago;

    @Column(name = "ObservacionesDIAN", length = 4000)
    private String observacionesDIAN;

    @Column(name = "OrdenCompra", length = 20)
    private String ordenCompra;

    @Column(name = "Descuentos")
    private java.math.BigDecimal descuentos;

    @Column(name = "Anticipos")
    private java.math.BigDecimal anticipos;

    @Column(name = "NumeroFacturaDependiente", length = 20)
    private String numeroFacturaDependiente;

    @Column(name = "FechaFacturaDependiente")
    private java.time.LocalDateTime fechaFacturaDependiente;

    @Column(name = "IdConceptoDependiente")
    private Integer idConceptoDependiente;

    @Column(name = "ObservacionConceptoDIAN", length = 250)
    private String observacionConceptoDIAN;

    @Column(name = "NumeroRemision", length = 40)
    private String numeroRemision;

    @Column(name = "NotaRecepcion", length = 40)
    private String notaRecepcion;

    @Column(name = "EANTiendaEntrega", length = 40)
    private String eANTiendaEntrega;

    @Column(name = "IdCondicionVenta")
    private Integer idCondicionVenta;

    @Column(name = "IdIPS")
    private Integer idIPS;

    @Column(name = "ServiciosIds", length = 8000)
    private String serviciosIds;

    @Column(name = "NumNotaCredito")
    private Integer numNotaCredito;

    @Column(name = "NumNotaDebito")
    private Integer numNotaDebito;

    @Column(name = "EsFacturaSalud", nullable = false)
    private Boolean esFacturaSalud;

    @Column(name = "IdModalidadPago")
    private Short idModalidadPago;

    @Column(name = "IdTipoOperacion")
    private Short idTipoOperacion;

    @Column(name = "Prefijo", length = 5)
    private String prefijo;

    public Integer getIdFactura() { return idFactura; }
    public Integer getNumeroFactura() { return numeroFactura; }
    public Integer getConsecutivoRemision() { return consecutivoRemision; }
    public Integer getIdEps() { return idEps; }
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
    public Integer getIdTipoFactura() { return idTipoFactura; }
    public Integer getIdFormaPago() { return idFormaPago; }
    public String getObservacionesDIAN() { return observacionesDIAN; }
    public String getOrdenCompra() { return ordenCompra; }
    public java.math.BigDecimal getDescuentos() { return descuentos; }
    public java.math.BigDecimal getAnticipos() { return anticipos; }
    public String getNumeroFacturaDependiente() { return numeroFacturaDependiente; }
    public java.time.LocalDateTime getFechaFacturaDependiente() { return fechaFacturaDependiente; }
    public Integer getIdConceptoDependiente() { return idConceptoDependiente; }
    public String getObservacionConceptoDIAN() { return observacionConceptoDIAN; }
    public String getNumeroRemision() { return numeroRemision; }
    public String getNotaRecepcion() { return notaRecepcion; }
    public String getEANTiendaEntrega() { return eANTiendaEntrega; }
    public Integer getIdCondicionVenta() { return idCondicionVenta; }
    public Integer getIdIPS() { return idIPS; }
    public String getServiciosIds() { return serviciosIds; }
    public Integer getNumNotaCredito() { return numNotaCredito; }
    public Integer getNumNotaDebito() { return numNotaDebito; }
    public Boolean getEsFacturaSalud() { return esFacturaSalud; }
    public Short getIdModalidadPago() { return idModalidadPago; }
    public Short getIdTipoOperacion() { return idTipoOperacion; }
    public String getPrefijo() { return prefijo; }
}
