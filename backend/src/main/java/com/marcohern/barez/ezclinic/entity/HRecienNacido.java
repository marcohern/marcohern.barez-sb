package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "HRecienNacido")
public class HRecienNacido {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "EdadGestacional", length = 2)
    private String edadGestacional;

    @Column(name = "ControlPrenatal", nullable = false)
    private Boolean controlPrenatal;

    @Column(name = "FechaMuerteMadre")
    private java.time.LocalDateTime fechaMuerteMadre;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "Peso", length = 4)
    private String peso;

    @Column(name = "Talla", length = 2)
    private String talla;

    @Column(name = "Temperatura")
    private Integer temperatura;

    @Column(name = "TensionArterial", length = 10)
    private String tensionArterial;

    @Column(name = "FrecuenciaCardiaca", length = 10)
    private String frecuenciaCardiaca;

    @Column(name = "FrecuenciaRespiratoria", length = 10)
    private String frecuenciaRespiratoria;

    @Column(name = "ExamenFisico")
    private String examenFisico;

    @Column(name = "Apagar5Min", length = 1)
    private String apagar5Min;

    @Column(name = "FechaMuerte")
    private java.time.LocalDateTime fechaMuerte;

    public Integer getIdAuto() { return idAuto; }
    public String getEdadGestacional() { return edadGestacional; }
    public Boolean getControlPrenatal() { return controlPrenatal; }
    public java.time.LocalDateTime getFechaMuerteMadre() { return fechaMuerteMadre; }
    public Integer getIdSexo() { return idSexo; }
    public String getPeso() { return peso; }
    public String getTalla() { return talla; }
    public Integer getTemperatura() { return temperatura; }
    public String getTensionArterial() { return tensionArterial; }
    public String getFrecuenciaCardiaca() { return frecuenciaCardiaca; }
    public String getFrecuenciaRespiratoria() { return frecuenciaRespiratoria; }
    public String getExamenFisico() { return examenFisico; }
    public String getApagar5Min() { return apagar5Min; }
    public java.time.LocalDateTime getFechaMuerte() { return fechaMuerte; }
}
