package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Anestesia")
public class Anestesia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAnestesia", nullable = false)
    private Integer idAnestesia;

    @Column(name = "Anestesia")
    private String anestesia;

    public Integer getIdAnestesia() { return idAnestesia; }
    public String getAnestesia() { return anestesia; }
}
