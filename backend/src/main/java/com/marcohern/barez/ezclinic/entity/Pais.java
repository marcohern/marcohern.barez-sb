package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPais", nullable = false)
    private Integer idPais;

    @Column(name = "Pais", nullable = false, length = 50)
    private String pais;

    @Column(name = "ValorRia", length = 3)
    private String valorRia;

    @Column(name = "Consecutivo", nullable = false)
    private Integer consecutivo;

    @Column(name = "CodigoISO", length = 3)
    private String codigoISO;

    public Integer getIdPais() { return idPais; }
    public String getPais() { return pais; }
    public String getValorRia() { return valorRia; }
    public Integer getConsecutivo() { return consecutivo; }
    public String getCodigoISO() { return codigoISO; }
}
