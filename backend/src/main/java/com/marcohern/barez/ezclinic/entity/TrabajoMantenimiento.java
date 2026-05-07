package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TrabajoMantenimiento")
public class TrabajoMantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTrabajo", nullable = false)
    private Integer idTrabajo;

    @Column(name = "TipoTrabajo", length = 50)
    private String tipoTrabajo;

    @Column(name = "Descripcion", length = 50)
    private String descripcion;

    @Column(name = "Notas")
    private String notas;

    public Integer getIdTrabajo() { return idTrabajo; }
    public String getTipoTrabajo() { return tipoTrabajo; }
    public String getDescripcion() { return descripcion; }
    public String getNotas() { return notas; }
}
