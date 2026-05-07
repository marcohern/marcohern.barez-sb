package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Mantenimiento")
public class Mantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMantenimiento", nullable = false)
    private Integer idMantenimiento;

    @Column(name = "IdRecurso", nullable = false)
    private Integer idRecurso;

    @Column(name = "IdTrabajo", nullable = false)
    private Integer idTrabajo;

    @Column(name = "Fecha")
    private java.time.LocalDateTime fecha;

    @Column(name = "GastosGenerados")
    private java.math.BigDecimal gastosGenerados;

    @Column(name = "Operario", length = 50)
    private String operario;

    @Column(name = "Observaciones")
    private String observaciones;

    public Integer getIdMantenimiento() { return idMantenimiento; }
    public Integer getIdRecurso() { return idRecurso; }
    public Integer getIdTrabajo() { return idTrabajo; }
    public java.time.LocalDateTime getFecha() { return fecha; }
    public java.math.BigDecimal getGastosGenerados() { return gastosGenerados; }
    public String getOperario() { return operario; }
    public String getObservaciones() { return observaciones; }
}
