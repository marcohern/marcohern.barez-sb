package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoAntecedente")
public class TipoAntecedente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoAntecedente", nullable = false)
    private Integer idTipoAntecedente;

    @Column(name = "TipoAntecedente", length = 100)
    private String tipoAntecedente;

    public Integer getIdTipoAntecedente() { return idTipoAntecedente; }
    public String getTipoAntecedente() { return tipoAntecedente; }
}
