package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EPS")
public class EPS {

    @Id
    @Column(name = "IdEPS", nullable = false)
    private Integer idEPS;

    @Column(name = "NIT", length = 50)
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

    @Column(name = "PaginaWeb", length = 200)
    private String paginaWeb;

    @Column(name = "TelAutoRemota", length = 15)
    private String telAutoRemota;

    @Column(name = "NumContratoGeneral", length = 15)
    private String numContratoGeneral;

    @Column(name = "EpsSuspendida", nullable = false)
    private Boolean epsSuspendida;

    @Column(name = "Notas")
    private String notas;

    @Column(name = "Logo", length = 100)
    private String logo;

    @Column(name = "ImprimirLogo", nullable = false)
    private Boolean imprimirLogo;

    @Column(name = "Slogan", length = 50)
    private String slogan;

    @Column(name = "IdActividad")
    private Integer idActividad;

    @Column(name = "CorreoElectronico", length = 255)
    private String correoElectronico;

    @Column(name = "IdTipoRegimen")
    private Integer idTipoRegimen;

    public Integer getIdEPS() { return idEPS; }
    public String getNIT() { return nIT; }
    public String getDireccion() { return direccion; }
    public Integer getIdCiudad() { return idCiudad; }
    public String getConmutador() { return conmutador; }
    public String getTelefono1() { return telefono1; }
    public String getTelefono2() { return telefono2; }
    public String getTelefono3() { return telefono3; }
    public String getFax() { return fax; }
    public String getPaginaWeb() { return paginaWeb; }
    public String getTelAutoRemota() { return telAutoRemota; }
    public String getNumContratoGeneral() { return numContratoGeneral; }
    public Boolean getEpsSuspendida() { return epsSuspendida; }
    public String getNotas() { return notas; }
    public String getLogo() { return logo; }
    public Boolean getImprimirLogo() { return imprimirLogo; }
    public String getSlogan() { return slogan; }
    public Integer getIdActividad() { return idActividad; }
    public String getCorreoElectronico() { return correoElectronico; }
    public Integer getIdTipoRegimen() { return idTipoRegimen; }
}
