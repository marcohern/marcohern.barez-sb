package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "PersonalAtencion")
public class PersonalAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersonal", nullable = false)
    private Integer idPersonal;

    @Column(name = "Personal", length = 30)
    private String personal;

    public Integer getIdPersonal() { return idPersonal; }
    public String getPersonal() { return personal; }
}
