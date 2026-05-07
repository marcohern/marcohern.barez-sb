package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TablasCIE")
public class TablasCIE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTablaCIE", nullable = false)
    private Integer idTablaCIE;

    @Column(name = "TablaCIE", nullable = false, length = 20)
    private String tablaCIE;

    @Column(name = "Fecha", nullable = false)
    private java.time.LocalDateTime fecha;

    @Column(name = "Activo", nullable = false)
    private Boolean activo;

    public Integer getIdTablaCIE() { return idTablaCIE; }
    public String getTablaCIE() { return tablaCIE; }
    public java.time.LocalDateTime getFecha() { return fecha; }
    public Boolean getActivo() { return activo; }
}
