package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "DescripcionQuirurgica")
public class DescripcionQuirurgica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDescripcionQuirurgica", nullable = false)
    private Integer idDescripcionQuirurgica;

    @Column(name = "DescripcionQuirurgica")
    private String descripcionQuirurgica;

    public Integer getIdDescripcionQuirurgica() { return idDescripcionQuirurgica; }
    public String getDescripcionQuirurgica() { return descripcionQuirurgica; }
}
