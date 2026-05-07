package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Archivos")
public class Archivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArchivo", nullable = false)
    private Long idArchivo;

    @Column(name = "NombreArchivo", nullable = false, length = 500)
    private String nombreArchivo;

    @Column(name = "TamanoArchivo", nullable = false)
    private Integer tamanoArchivo;

    @Column(name = "RutaRelativa", nullable = false, length = 500)
    private String rutaRelativa;

    public Long getIdArchivo() { return idArchivo; }
    public String getNombreArchivo() { return nombreArchivo; }
    public Integer getTamanoArchivo() { return tamanoArchivo; }
    public String getRutaRelativa() { return rutaRelativa; }
}
