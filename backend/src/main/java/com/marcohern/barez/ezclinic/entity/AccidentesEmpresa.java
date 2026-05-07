package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AccidentesEmpresa")
public class AccidentesEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAccidente", nullable = false)
    private Integer idAccidente;

    @Column(name = "IdEmpresaPaciente")
    private Integer idEmpresaPaciente;

    @Column(name = "IdCausa")
    private Integer idCausa;

    @Column(name = "IdTipoLesion")
    private Integer idTipoLesion;

    @Column(name = "FechaAccidente")
    private java.time.LocalDateTime fechaAccidente;

    @Column(name = "Secuelas", length = 100)
    private String secuelas;

    @Column(name = "DiasIncapacidad")
    private Integer diasIncapacidad;

    public Integer getIdAccidente() { return idAccidente; }
    public Integer getIdEmpresaPaciente() { return idEmpresaPaciente; }
    public Integer getIdCausa() { return idCausa; }
    public Integer getIdTipoLesion() { return idTipoLesion; }
    public java.time.LocalDateTime getFechaAccidente() { return fechaAccidente; }
    public String getSecuelas() { return secuelas; }
    public Integer getDiasIncapacidad() { return diasIncapacidad; }
}
