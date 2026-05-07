package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ConstantesSistema")
public class ConstantesSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRegistro", nullable = false)
    private Integer idRegistro;

    @Column(name = "IdCategoria")
    private Integer idCategoria;

    @Column(name = "Valor", length = 100)
    private String valor;

    @Column(name = "Activo", nullable = false)
    private Boolean activo;

    public Integer getIdRegistro() { return idRegistro; }
    public Integer getIdCategoria() { return idCategoria; }
    public String getValor() { return valor; }
    public Boolean getActivo() { return activo; }
}
