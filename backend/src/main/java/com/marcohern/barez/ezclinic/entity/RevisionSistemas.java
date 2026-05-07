package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "RevisionSistemas")
public class RevisionSistemas {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "IdDigestivo")
    private Integer idDigestivo;

    @Column(name = "IdRespiratorio")
    private Integer idRespiratorio;

    @Column(name = "IdCardiovascular")
    private Integer idCardiovascular;

    @Column(name = "IdOsteomuscular")
    private Integer idOsteomuscular;

    @Column(name = "IdGinecoObstetrico")
    private Integer idGinecoObstetrico;

    @Column(name = "IdPiel y faneras")
    private Integer idPielYFaneras;

    @Column(name = "IdUrinario")
    private Integer idUrinario;

    @Column(name = "IdEndocrino")
    private Integer idEndocrino;

    @Column(name = "IdNeurologico")
    private Integer idNeurologico;

    @Column(name = "IdOtorrinolaringologico")
    private Integer idOtorrinolaringologico;

    @Column(name = "IdMental")
    private Integer idMental;

    @Column(name = "IdOdontologico")
    private Integer idOdontologico;

    @Column(name = "IdAfectivo")
    private Integer idAfectivo;

    @Column(name = "IdSexual")
    private Integer idSexual;

    @Column(name = "IdSabor")
    private Integer idSabor;

    @Column(name = "IdOcular")
    private Integer idOcular;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdDigestivo() { return idDigestivo; }
    public Integer getIdRespiratorio() { return idRespiratorio; }
    public Integer getIdCardiovascular() { return idCardiovascular; }
    public Integer getIdOsteomuscular() { return idOsteomuscular; }
    public Integer getIdGinecoObstetrico() { return idGinecoObstetrico; }
    public Integer getIdPielYFaneras() { return idPielYFaneras; }
    public Integer getIdUrinario() { return idUrinario; }
    public Integer getIdEndocrino() { return idEndocrino; }
    public Integer getIdNeurologico() { return idNeurologico; }
    public Integer getIdOtorrinolaringologico() { return idOtorrinolaringologico; }
    public Integer getIdMental() { return idMental; }
    public Integer getIdOdontologico() { return idOdontologico; }
    public Integer getIdAfectivo() { return idAfectivo; }
    public Integer getIdSexual() { return idSexual; }
    public Integer getIdSabor() { return idSabor; }
    public Integer getIdOcular() { return idOcular; }
}
