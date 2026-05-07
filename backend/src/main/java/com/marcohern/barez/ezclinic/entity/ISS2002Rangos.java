package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ISS2002Rangos")
public class ISS2002Rangos {

    @Id
    @Column(name = "CodigoCUPS", nullable = false, length = 8)
    private String codigoCUPS;

    @Column(name = "IdTablaMed")
    private Integer idTablaMed;

    @Column(name = "IdTablaAnest")
    private Integer idTablaAnest;

    @Column(name = "IdTablaAyud")
    private Integer idTablaAyud;

    @Column(name = "IdTablaSala")
    private Integer idTablaSala;

    @Column(name = "IdTablaMat")
    private Integer idTablaMat;

    @Column(name = "IdTablaOtro")
    private Integer idTablaOtro;

    public String getCodigoCUPS() { return codigoCUPS; }
    public Integer getIdTablaMed() { return idTablaMed; }
    public Integer getIdTablaAnest() { return idTablaAnest; }
    public Integer getIdTablaAyud() { return idTablaAyud; }
    public Integer getIdTablaSala() { return idTablaSala; }
    public Integer getIdTablaMat() { return idTablaMat; }
    public Integer getIdTablaOtro() { return idTablaOtro; }
}
