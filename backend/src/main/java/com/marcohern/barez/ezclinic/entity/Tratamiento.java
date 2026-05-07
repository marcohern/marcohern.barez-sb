package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Tratamiento")
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTratamiento", nullable = false)
    private Integer idTratamiento;

    @Column(name = "Tratamiento", nullable = false, length = 50)
    private String tratamiento;

    public Integer getIdTratamiento() { return idTratamiento; }
    public String getTratamiento() { return tratamiento; }
}
