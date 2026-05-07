package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Imagenes")
public class Imagenes {

    @Id
    @Column(name = "IdImagen", nullable = false, length = 100)
    private String idImagen;

    @Column(name = "ImagenDer")
    private byte[] imagenDer;

    @Column(name = "ImagenIzq")
    private byte[] imagenIzq;

    @Column(name = "Activo", nullable = false)
    private Boolean activo;

    public String getIdImagen() { return idImagen; }
    public byte[] getImagenDer() { return imagenDer; }
    public byte[] getImagenIzq() { return imagenIzq; }
    public Boolean getActivo() { return activo; }
}
