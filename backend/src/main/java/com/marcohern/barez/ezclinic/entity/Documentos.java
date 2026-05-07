package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Documentos")
public class Documentos {

    @Id
    @Column(name = "IdArchivo", nullable = false)
    private Long idArchivo;

    @Column(name = "IdIPS", nullable = false)
    private Integer idIPS;

    @Column(name = "IdTipoDocumento", nullable = false)
    private Integer idTipoDocumento;

    @Column(name = "Nombre", nullable = false, length = 512)
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Visibilidad", nullable = false)
    private Short visibilidad;

    public Long getIdArchivo() { return idArchivo; }
    public Integer getIdIPS() { return idIPS; }
    public Integer getIdTipoDocumento() { return idTipoDocumento; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public Short getVisibilidad() { return visibilidad; }
}
