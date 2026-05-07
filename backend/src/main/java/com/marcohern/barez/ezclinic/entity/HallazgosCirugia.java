package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "HallazgosCirugia")
public class HallazgosCirugia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdHallazgo", nullable = false)
    private Integer idHallazgo;

    @Column(name = "Hallazgo")
    private String hallazgo;

    public Integer getIdHallazgo() { return idHallazgo; }
    public String getHallazgo() { return hallazgo; }
}
