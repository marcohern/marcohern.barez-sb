package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Recibos")
public class Recibos {

    @Id
    @Column(name = "ReciboNo", nullable = false)
    private Integer reciboNo;

    @Column(name = "Abono")
    private java.math.BigDecimal abono;

    @Column(name = "Fecha")
    private java.time.LocalDateTime fecha;

    @Column(name = "Hora")
    private java.time.LocalDateTime hora;

    @Column(name = "IdFormaPago")
    private Integer idFormaPago;

    @Column(name = "NumDocumento", length = 20)
    private String numDocumento;

    @Column(name = "IdBanco")
    private Integer idBanco;

    @Column(name = "IdEmpleado")
    private Integer idEmpleado;

    public Integer getReciboNo() { return reciboNo; }
    public java.math.BigDecimal getAbono() { return abono; }
    public java.time.LocalDateTime getFecha() { return fecha; }
    public java.time.LocalDateTime getHora() { return hora; }
    public Integer getIdFormaPago() { return idFormaPago; }
    public String getNumDocumento() { return numDocumento; }
    public Integer getIdBanco() { return idBanco; }
    public Integer getIdEmpleado() { return idEmpleado; }
}
