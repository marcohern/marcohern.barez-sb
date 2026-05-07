package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Hallazgos")
public class Hallazgos {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "IdCabeza")
    private Integer idCabeza;

    @Column(name = "IdOjos")
    private Integer idOjos;

    @Column(name = "IdNariz")
    private Integer idNariz;

    @Column(name = "IdBoca")
    private Integer idBoca;

    @Column(name = "IdDentadura")
    private Integer idDentadura;

    @Column(name = "IdFaringe")
    private Integer idFaringe;

    @Column(name = "IdLaringe")
    private Integer idLaringe;

    @Column(name = "IdOidos")
    private Integer idOidos;

    @Column(name = "IdCuello")
    private Integer idCuello;

    @Column(name = "IdTorax")
    private Integer idTorax;

    @Column(name = "IdSenos")
    private Integer idSenos;

    @Column(name = "IdCorazon")
    private Integer idCorazon;

    @Column(name = "IdPulmones")
    private Integer idPulmones;

    @Column(name = "IdAbdomen")
    private Integer idAbdomen;

    @Column(name = "IdGenitales")
    private Integer idGenitales;

    @Column(name = "IdMMSS")
    private Integer idMMSS;

    @Column(name = "IdMMII")
    private Integer idMMII;

    @Column(name = "IdColumna")
    private Integer idColumna;

    @Column(name = "IdNeurologico")
    private Integer idNeurologico;

    @Column(name = "IdPiel")
    private Integer idPiel;

    @Column(name = "IdFaneras")
    private Integer idFaneras;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdCabeza() { return idCabeza; }
    public Integer getIdOjos() { return idOjos; }
    public Integer getIdNariz() { return idNariz; }
    public Integer getIdBoca() { return idBoca; }
    public Integer getIdDentadura() { return idDentadura; }
    public Integer getIdFaringe() { return idFaringe; }
    public Integer getIdLaringe() { return idLaringe; }
    public Integer getIdOidos() { return idOidos; }
    public Integer getIdCuello() { return idCuello; }
    public Integer getIdTorax() { return idTorax; }
    public Integer getIdSenos() { return idSenos; }
    public Integer getIdCorazon() { return idCorazon; }
    public Integer getIdPulmones() { return idPulmones; }
    public Integer getIdAbdomen() { return idAbdomen; }
    public Integer getIdGenitales() { return idGenitales; }
    public Integer getIdMMSS() { return idMMSS; }
    public Integer getIdMMII() { return idMMII; }
    public Integer getIdColumna() { return idColumna; }
    public Integer getIdNeurologico() { return idNeurologico; }
    public Integer getIdPiel() { return idPiel; }
    public Integer getIdFaneras() { return idFaneras; }
}
