package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoAfiliado")
public class TipoAfiliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoAfiliado", nullable = false)
    private Integer idTipoAfiliado;

    @Column(name = "TipoDeAfiliado", length = 150)
    private String tipoDeAfiliado;

    @Column(name = "ValorRia", length = 2)
    private String valorRia;

    public Integer getIdTipoAfiliado() { return idTipoAfiliado; }
    public String getTipoDeAfiliado() { return tipoDeAfiliado; }
    public String getValorRia() { return valorRia; }
}
