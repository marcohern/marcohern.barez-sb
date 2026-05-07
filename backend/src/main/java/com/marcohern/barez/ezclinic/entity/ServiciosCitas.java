package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ServiciosCitas")
public class ServiciosCitas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "IdPaciente", nullable = false)
    private Integer idPaciente;

    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "ServicioPrincipal", nullable = false)
    private Boolean servicioPrincipal;

    @Column(name = "FechaAsignacion")
    private java.time.LocalDateTime fechaAsignacion;

    @Column(name = "HoraAsignacion")
    private java.time.LocalDateTime horaAsignacion;

    @Column(name = "DuracionServicio", length = 50)
    private String duracionServicio;

    @Column(name = "ValorServicio")
    private java.math.BigDecimal valorServicio;

    @Column(name = "ValorCopagoServicio")
    private java.math.BigDecimal valorCopagoServicio;

    @Column(name = "Descuento")
    private java.math.BigDecimal descuento;

    @Column(name = "NumeroRemision", length = 20)
    private String numeroRemision;

    @Column(name = "FechaSolicitud")
    private java.time.LocalDateTime fechaSolicitud;

    @Column(name = "NumeroAutoRIA", length = 15)
    private String numeroAutoRIA;

    @Column(name = "ServicioPrestado", nullable = false)
    private Boolean servicioPrestado;

    @Column(name = "ServicioSuspendido", nullable = false)
    private Boolean servicioSuspendido;

    @Column(name = "ServicioPagado", nullable = false)
    private Boolean servicioPagado;

    @Column(name = "ServicioConfirmado", nullable = false)
    private Boolean servicioConfirmado;

    @Column(name = "IdPlanSalud")
    private Integer idPlanSalud;

    @Column(name = "FacturarMedico", nullable = false)
    private Boolean facturarMedico;

    @Column(name = "NumFactura")
    private Integer numFactura;

    @Column(name = "ReciboEpsNo")
    private Integer reciboEpsNo;

    @Column(name = "ReciboEps", nullable = false)
    private Boolean reciboEps;

    @Column(name = "IdRemitente")
    private Integer idRemitente;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "IdEmpleado")
    private Integer idEmpleado;

    @Column(name = "FechaContable")
    private java.time.LocalDateTime fechaContable;

    @Column(name = "OldId")
    private Integer oldId;

    @Column(name = "NumFacturaVirtual")
    private Integer numFacturaVirtual;

    @Column(name = "ExcluirRIPS")
    private Boolean excluirRIPS;

    @Column(name = "IdFormulario")
    private Integer idFormulario;

    @Column(name = "GuidFormulario")
    private java.util.UUID guidFormulario;

    @Column(name = "FechaFormulario")
    private java.time.LocalDateTime fechaFormulario;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdPaciente() { return idPaciente; }
    public Integer getIdServicio() { return idServicio; }
    public Boolean getServicioPrincipal() { return servicioPrincipal; }
    public java.time.LocalDateTime getFechaAsignacion() { return fechaAsignacion; }
    public java.time.LocalDateTime getHoraAsignacion() { return horaAsignacion; }
    public String getDuracionServicio() { return duracionServicio; }
    public java.math.BigDecimal getValorServicio() { return valorServicio; }
    public java.math.BigDecimal getValorCopagoServicio() { return valorCopagoServicio; }
    public java.math.BigDecimal getDescuento() { return descuento; }
    public String getNumeroRemision() { return numeroRemision; }
    public java.time.LocalDateTime getFechaSolicitud() { return fechaSolicitud; }
    public String getNumeroAutoRIA() { return numeroAutoRIA; }
    public Boolean getServicioPrestado() { return servicioPrestado; }
    public Boolean getServicioSuspendido() { return servicioSuspendido; }
    public Boolean getServicioPagado() { return servicioPagado; }
    public Boolean getServicioConfirmado() { return servicioConfirmado; }
    public Integer getIdPlanSalud() { return idPlanSalud; }
    public Boolean getFacturarMedico() { return facturarMedico; }
    public Integer getNumFactura() { return numFactura; }
    public Integer getReciboEpsNo() { return reciboEpsNo; }
    public Boolean getReciboEps() { return reciboEps; }
    public Integer getIdRemitente() { return idRemitente; }
    public String getObservaciones() { return observaciones; }
    public Integer getIdEmpleado() { return idEmpleado; }
    public java.time.LocalDateTime getFechaContable() { return fechaContable; }
    public Integer getOldId() { return oldId; }
    public Integer getNumFacturaVirtual() { return numFacturaVirtual; }
    public Boolean getExcluirRIPS() { return excluirRIPS; }
    public Integer getIdFormulario() { return idFormulario; }
    public java.util.UUID getGuidFormulario() { return guidFormulario; }
    public java.time.LocalDateTime getFechaFormulario() { return fechaFormulario; }
}
