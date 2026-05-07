package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Proveedores")
public class Proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProveedor", nullable = false)
    private Integer idProveedor;

    @Column(name = "NombreProveedor", length = 100)
    private String nombreProveedor;

    @Column(name = "NIT", length = 15)
    private String nIT;

    @Column(name = "Direccion", length = 50)
    private String direccion;

    @Column(name = "IdCiudad")
    private Integer idCiudad;

    @Column(name = "Conmutador", length = 15)
    private String conmutador;

    @Column(name = "Telefono1", length = 15)
    private String telefono1;

    @Column(name = "Telefono2", length = 15)
    private String telefono2;

    @Column(name = "Telefono3", length = 15)
    private String telefono3;

    @Column(name = "Fax", length = 15)
    private String fax;

    @Column(name = "Paginaweb", length = 200)
    private String paginaweb;

    @Column(name = "ProveedorSuspendido", nullable = false)
    private Boolean proveedorSuspendido;

    @Column(name = "Notas")
    private String notas;

    public Integer getIdProveedor() { return idProveedor; }
    public String getNombreProveedor() { return nombreProveedor; }
    public String getNIT() { return nIT; }
    public String getDireccion() { return direccion; }
    public Integer getIdCiudad() { return idCiudad; }
    public String getConmutador() { return conmutador; }
    public String getTelefono1() { return telefono1; }
    public String getTelefono2() { return telefono2; }
    public String getTelefono3() { return telefono3; }
    public String getFax() { return fax; }
    public String getPaginaweb() { return paginaweb; }
    public Boolean getProveedorSuspendido() { return proveedorSuspendido; }
    public String getNotas() { return notas; }
}
