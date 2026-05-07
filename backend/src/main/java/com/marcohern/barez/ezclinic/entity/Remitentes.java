package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Remitentes")
public class Remitentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRemitente", nullable = false)
    private Integer idRemitente;

    @Column(name = "Remitente", length = 100)
    private String remitente;

    public Integer getIdRemitente() { return idRemitente; }
    public String getRemitente() { return remitente; }
}
