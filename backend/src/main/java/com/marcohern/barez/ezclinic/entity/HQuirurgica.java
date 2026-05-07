package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "HQuirurgica")
public class HQuirurgica {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "IdClaseProcedimiento")
    private Integer idClaseProcedimiento;

    @Column(name = "IdTipoProcedimiento")
    private Integer idTipoProcedimiento;

    @Column(name = "IdPersonal")
    private Integer idPersonal;

    @Column(name = "CondicionPaciente", length = 80)
    private String condicionPaciente;

    @Column(name = "IdFormaProcedimiento")
    private Integer idFormaProcedimiento;

    @Column(name = "IdHallazgo")
    private Integer idHallazgo;

    @Column(name = "IdComplicacion")
    private Integer idComplicacion;

    @Column(name = "IdInfeccion")
    private Integer idInfeccion;

    @Column(name = "IdTipoAnestesia")
    private Integer idTipoAnestesia;

    @Column(name = "IdAnestesia")
    private Integer idAnestesia;

    @Column(name = "IdDescripcionQuirurgica")
    private Integer idDescripcionQuirurgica;

    @Column(name = "IdCirujano")
    private Integer idCirujano;

    @Column(name = "IdCirujano1")
    private Integer idCirujano1;

    @Column(name = "IdAnestesiologo")
    private Integer idAnestesiologo;

    @Column(name = "IdAuxiliar")
    private Integer idAuxiliar;

    @Column(name = "IdInstrumentador")
    private Integer idInstrumentador;

    @Column(name = "IdAyudante1")
    private Integer idAyudante1;

    @Column(name = "IdAyudante2")
    private Integer idAyudante2;

    @Column(name = "IdCirculante")
    private Integer idCirculante;

    @Column(name = "HoraIniAnest")
    private java.time.LocalDateTime horaIniAnest;

    @Column(name = "HoraFinAnest")
    private java.time.LocalDateTime horaFinAnest;

    @Column(name = "HoraIniCirugia")
    private java.time.LocalDateTime horaIniCirugia;

    @Column(name = "HoraFinCirugia")
    private java.time.LocalDateTime horaFinCirugia;

    @Column(name = "RecomendacionEvaluacion")
    private String recomendacionEvaluacion;

    @Column(name = "RecomendacionLaboral")
    private String recomendacionLaboral;

    @Column(name = "IdCalificacion")
    private Integer idCalificacion;

    @Column(name = "IdMotivoConsulta")
    private Integer idMotivoConsulta;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdClaseProcedimiento() { return idClaseProcedimiento; }
    public Integer getIdTipoProcedimiento() { return idTipoProcedimiento; }
    public Integer getIdPersonal() { return idPersonal; }
    public String getCondicionPaciente() { return condicionPaciente; }
    public Integer getIdFormaProcedimiento() { return idFormaProcedimiento; }
    public Integer getIdHallazgo() { return idHallazgo; }
    public Integer getIdComplicacion() { return idComplicacion; }
    public Integer getIdInfeccion() { return idInfeccion; }
    public Integer getIdTipoAnestesia() { return idTipoAnestesia; }
    public Integer getIdAnestesia() { return idAnestesia; }
    public Integer getIdDescripcionQuirurgica() { return idDescripcionQuirurgica; }
    public Integer getIdCirujano() { return idCirujano; }
    public Integer getIdCirujano1() { return idCirujano1; }
    public Integer getIdAnestesiologo() { return idAnestesiologo; }
    public Integer getIdAuxiliar() { return idAuxiliar; }
    public Integer getIdInstrumentador() { return idInstrumentador; }
    public Integer getIdAyudante1() { return idAyudante1; }
    public Integer getIdAyudante2() { return idAyudante2; }
    public Integer getIdCirculante() { return idCirculante; }
    public java.time.LocalDateTime getHoraIniAnest() { return horaIniAnest; }
    public java.time.LocalDateTime getHoraFinAnest() { return horaFinAnest; }
    public java.time.LocalDateTime getHoraIniCirugia() { return horaIniCirugia; }
    public java.time.LocalDateTime getHoraFinCirugia() { return horaFinCirugia; }
    public String getRecomendacionEvaluacion() { return recomendacionEvaluacion; }
    public String getRecomendacionLaboral() { return recomendacionLaboral; }
    public Integer getIdCalificacion() { return idCalificacion; }
    public Integer getIdMotivoConsulta() { return idMotivoConsulta; }
}
