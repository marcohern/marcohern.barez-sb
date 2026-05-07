package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProducto", nullable = false)
    private Integer idProducto;

    @Column(name = "Producto", nullable = false, length = 200)
    private String producto;

    @Column(name = "Codigo", nullable = false, length = 40)
    private String codigo;

    @Column(name = "IdUnidad", nullable = false)
    private Integer idUnidad;

    public Integer getIdProducto() { return idProducto; }
    public String getProducto() { return producto; }
    public String getCodigo() { return codigo; }
    public Integer getIdUnidad() { return idUnidad; }
}
