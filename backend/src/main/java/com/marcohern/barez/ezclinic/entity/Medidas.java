package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Medidas")
public class Medidas {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Column(name = "BrazoDer")
    private Float brazoDer;

    @Column(name = "BrazoIzq")
    private Float brazoIzq;

    @Column(name = "MusloDer")
    private Float musloDer;

    @Column(name = "MusloIzq")
    private Float musloIzq;

    @Column(name = "Busto")
    private Float busto;

    @Column(name = "Torax")
    private Float torax;

    @Column(name = "Cintura")
    private Float cintura;

    @Column(name = "Cadera")
    private Float cadera;

    @Column(name = "Brasier", length = 10)
    private String brasier;

    @Column(name = "Blusa", length = 10)
    private String blusa;

    @Column(name = "Pantalon", length = 10)
    private String pantalon;

    public Integer getIdAuto() { return idAuto; }
    public Float getBrazoDer() { return brazoDer; }
    public Float getBrazoIzq() { return brazoIzq; }
    public Float getMusloDer() { return musloDer; }
    public Float getMusloIzq() { return musloIzq; }
    public Float getBusto() { return busto; }
    public Float getTorax() { return torax; }
    public Float getCintura() { return cintura; }
    public Float getCadera() { return cadera; }
    public String getBrasier() { return brasier; }
    public String getBlusa() { return blusa; }
    public String getPantalon() { return pantalon; }
}
