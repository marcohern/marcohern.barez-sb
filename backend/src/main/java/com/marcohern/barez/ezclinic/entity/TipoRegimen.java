package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoRegimen")
public class TipoRegimen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoRegimen", nullable = false)
    private Integer idTipoRegimen;

    @Column(name = "TipoRegimen", nullable = false, length = 50)
    private String tipoRegimen;

    @Column(name = "Codigo", nullable = false, length = 2)
    private String codigo;

    public Integer getIdTipoRegimen() { return idTipoRegimen; }
    public String getTipoRegimen() { return tipoRegimen; }
    public String getCodigo() { return codigo; }
}
