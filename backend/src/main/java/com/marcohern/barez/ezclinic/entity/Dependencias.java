package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Dependencias")
public class Dependencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDependencia", nullable = false)
    private Integer idDependencia;

    @Column(name = "NomDependencia", length = 50)
    private String nomDependencia;

    @Column(name = "Ubicacion", length = 50)
    private String ubicacion;

    @Column(name = "Telefono", length = 15)
    private String telefono;

    @Column(name = "Extension", length = 15)
    private String extension;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "IdPadre")
    private Integer idPadre;

    @Column(name = "TipoID", length = 2)
    private String tipoID;

    @Column(name = "NIT", length = 20)
    private String nIT;

    @Column(name = "CodigoRIPS", length = 12)
    private String codigoRIPS;

    @Column(name = "RazonSocial", length = 50)
    private String razonSocial;

    public Integer getIdDependencia() { return idDependencia; }
    public String getNomDependencia() { return nomDependencia; }
    public String getUbicacion() { return ubicacion; }
    public String getTelefono() { return telefono; }
    public String getExtension() { return extension; }
    public String getObservaciones() { return observaciones; }
    public Integer getIdPadre() { return idPadre; }
    public String getTipoID() { return tipoID; }
    public String getNIT() { return nIT; }
    public String getCodigoRIPS() { return codigoRIPS; }
    public String getRazonSocial() { return razonSocial; }
}
