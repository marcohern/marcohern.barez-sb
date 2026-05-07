package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "IPSRangos")
public class IPSRangos {

    @Id
    @Column(name = "IdServicio", nullable = false)
    private Integer idServicio;

    @Column(name = "IdTablaMed")
    private Integer idTablaMed;

    @Column(name = "IdTablaAnest")
    private Integer idTablaAnest;

    @Column(name = "IdTablaAyud")
    private Integer idTablaAyud;

    @Column(name = "IdTablaMat")
    private Integer idTablaMat;

    @Column(name = "IdTablaSala")
    private Integer idTablaSala;

    @Column(name = "IdTablaOtro")
    private Integer idTablaOtro;

    public Integer getIdServicio() { return idServicio; }
    public Integer getIdTablaMed() { return idTablaMed; }
    public Integer getIdTablaAnest() { return idTablaAnest; }
    public Integer getIdTablaAyud() { return idTablaAyud; }
    public Integer getIdTablaMat() { return idTablaMat; }
    public Integer getIdTablaSala() { return idTablaSala; }
    public Integer getIdTablaOtro() { return idTablaOtro; }
}
