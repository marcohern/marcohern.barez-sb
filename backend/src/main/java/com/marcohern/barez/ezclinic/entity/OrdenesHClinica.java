package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "OrdenesHClinica")
public class OrdenesHClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrden", nullable = false)
    private Integer idOrden;

    @Column(name = "IdAuto")
    private Integer idAuto;

    @Column(name = "IdTipoOrden")
    private Integer idTipoOrden;

    @Column(name = "IdServicio")
    private Integer idServicio;

    @Column(name = "ValorRia", length = 6)
    private String valorRia;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdOrden() { return idOrden; }
    public Integer getIdAuto() { return idAuto; }
    public Integer getIdTipoOrden() { return idTipoOrden; }
    public Integer getIdServicio() { return idServicio; }
    public String getValorRia() { return valorRia; }
    public Integer getCantidad() { return cantidad; }
    public String getObservaciones() { return observaciones; }
}
