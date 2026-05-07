package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Sexo")
public class Sexo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSexo", nullable = false)
    private Integer idSexo;

    @Column(name = "Sexo", length = 15)
    private String sexo;

    @Column(name = "ValorSexo", length = 1)
    private String valorSexo;

    public Integer getIdSexo() { return idSexo; }
    public String getSexo() { return sexo; }
    public String getValorSexo() { return valorSexo; }
}
