package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Parentezco")
public class Parentezco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdParentezco", nullable = false)
    private Integer idParentezco;

    @Column(name = "Parentezco", length = 50)
    private String parentezco;

    public Integer getIdParentezco() { return idParentezco; }
    public String getParentezco() { return parentezco; }
}
