package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Nombres")
public class Nombres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdNombre", nullable = false)
    private Integer idNombre;

    @Column(name = "NombreHombre", length = 20)
    private String nombreHombre;

    @Column(name = "NombreMujer", length = 20)
    private String nombreMujer;

    @Column(name = "Apellido", length = 30)
    private String apellido;

    public Integer getIdNombre() { return idNombre; }
    public String getNombreHombre() { return nombreHombre; }
    public String getNombreMujer() { return nombreMujer; }
    public String getApellido() { return apellido; }
}
