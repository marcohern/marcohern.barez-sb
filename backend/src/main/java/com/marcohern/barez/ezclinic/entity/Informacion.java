package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Informacion")
public class Informacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdIPS", nullable = false)
    private Integer idIPS;

    @Column(name = "NombreIPS", length = 60)
    private String nombreIPS;

    @Column(name = "Sigla", length = 50)
    private String sigla;

    @Column(name = "Direccion", length = 50)
    private String direccion;

    @Column(name = "Conmutador", length = 50)
    private String conmutador;

    @Column(name = "Telefono", length = 50)
    private String telefono;

    @Column(name = "Telefono1", length = 50)
    private String telefono1;

    @Column(name = "TipoID", length = 2)
    private String tipoID;

    @Column(name = "NIT", length = 20)
    private String nIT;

    @Column(name = "CodigoRIPS", length = 10)
    private String codigoRIPS;

    @Column(name = "ResolucionDian", length = 50)
    private String resolucionDian;

    @Column(name = "FechaDIAN")
    private java.time.LocalDateTime fechaDIAN;

    @Column(name = "ReciboInicio")
    private Integer reciboInicio;

    @Column(name = "ReciboFinal")
    private Integer reciboFinal;

    @Column(name = "NumFactura")
    private Integer numFactura;

    @Column(name = "NumRecibo")
    private Integer numRecibo;

    @Column(name = "UltReferencia", length = 6)
    private String ultReferencia;

    @Column(name = "RutaBackup")
    private String rutaBackup;

    @Column(name = "DiasBackup")
    private Integer diasBackup;

    @Column(name = "NoValidaDatos", nullable = false)
    private Boolean noValidaDatos;

    @Column(name = "PermitirReciboServicio", nullable = false)
    private Boolean permitirReciboServicio;

    @Column(name = "Logo", length = 100)
    private String logo;

    @Column(name = "LicenciaSaludOcupacionalIPS", length = 50)
    private String licenciaSaludOcupacionalIPS;

    @Column(name = "IdCiudad")
    private Integer idCiudad;

    @Column(name = "RemitenteCorreo", length = 255)
    private String remitenteCorreo;

    @Column(name = "AsuntoCorreo", length = 255)
    private String asuntoCorreo;

    @Column(name = "CuerpoCorreo")
    private String cuerpoCorreo;

    @Column(name = "CuentaCorreo", length = 255)
    private String cuentaCorreo;

    @Column(name = "PasswordCorreo", length = 255)
    private String passwordCorreo;

    @Column(name = "RemitenteCorreoSol", length = 255)
    private String remitenteCorreoSol;

    @Column(name = "AsuntoCorreoSol", length = 255)
    private String asuntoCorreoSol;

    @Column(name = "CuerpoCorreoSol")
    private String cuerpoCorreoSol;

    @Column(name = "PasswordCorreoSol", length = 255)
    private String passwordCorreoSol;

    @Column(name = "CorreoSolicitudes", length = 255)
    private String correoSolicitudes;

    @Column(name = "UsarConsecutivoFacturas", nullable = false)
    private Boolean usarConsecutivoFacturas;

    @Column(name = "CorreoPagos", length = 255)
    private String correoPagos;

    @Column(name = "NumFacturaVirtual")
    private Integer numFacturaVirtual;

    @Column(name = "IdResponsabilidad")
    private Integer idResponsabilidad;

    @Column(name = "NumNotaCredito")
    private Integer numNotaCredito;

    @Column(name = "NumNotaDebito")
    private Integer numNotaDebito;

    @Column(name = "RemitenteCorreoForm", length = 255)
    private String remitenteCorreoForm;

    @Column(name = "AsuntoCorreoForm", length = 255)
    private String asuntoCorreoForm;

    @Column(name = "CuerpoCorreoForm")
    private String cuerpoCorreoForm;

    @Column(name = "PasswordCorreoForm", length = 255)
    private String passwordCorreoForm;

    @Column(name = "CorreoFormularios", length = 255)
    private String correoFormularios;

    @Column(name = "MensajeTtoDatos", length = 4000)
    private String mensajeTtoDatos;

    @Column(name = "CodigoREPSSede", length = 20)
    private String codigoREPSSede;

    @Column(name = "Prefijo", length = 5)
    private String prefijo;

    @Column(name = "FechaInicio")
    private java.time.LocalDateTime fechaInicio;

    @Column(name = "FechaFin")
    private java.time.LocalDateTime fechaFin;

    @Column(name = "IdMedico")
    private Integer idMedico;

    public Integer getIdIPS() { return idIPS; }
    public String getNombreIPS() { return nombreIPS; }
    public String getSigla() { return sigla; }
    public String getDireccion() { return direccion; }
    public String getConmutador() { return conmutador; }
    public String getTelefono() { return telefono; }
    public String getTelefono1() { return telefono1; }
    public String getTipoID() { return tipoID; }
    public String getNIT() { return nIT; }
    public String getCodigoRIPS() { return codigoRIPS; }
    public String getResolucionDian() { return resolucionDian; }
    public java.time.LocalDateTime getFechaDIAN() { return fechaDIAN; }
    public Integer getReciboInicio() { return reciboInicio; }
    public Integer getReciboFinal() { return reciboFinal; }
    public Integer getNumFactura() { return numFactura; }
    public Integer getNumRecibo() { return numRecibo; }
    public String getUltReferencia() { return ultReferencia; }
    public String getRutaBackup() { return rutaBackup; }
    public Integer getDiasBackup() { return diasBackup; }
    public Boolean getNoValidaDatos() { return noValidaDatos; }
    public Boolean getPermitirReciboServicio() { return permitirReciboServicio; }
    public String getLogo() { return logo; }
    public String getLicenciaSaludOcupacionalIPS() { return licenciaSaludOcupacionalIPS; }
    public Integer getIdCiudad() { return idCiudad; }
    public String getRemitenteCorreo() { return remitenteCorreo; }
    public String getAsuntoCorreo() { return asuntoCorreo; }
    public String getCuerpoCorreo() { return cuerpoCorreo; }
    public String getCuentaCorreo() { return cuentaCorreo; }
    public String getPasswordCorreo() { return passwordCorreo; }
    public String getRemitenteCorreoSol() { return remitenteCorreoSol; }
    public String getAsuntoCorreoSol() { return asuntoCorreoSol; }
    public String getCuerpoCorreoSol() { return cuerpoCorreoSol; }
    public String getPasswordCorreoSol() { return passwordCorreoSol; }
    public String getCorreoSolicitudes() { return correoSolicitudes; }
    public Boolean getUsarConsecutivoFacturas() { return usarConsecutivoFacturas; }
    public String getCorreoPagos() { return correoPagos; }
    public Integer getNumFacturaVirtual() { return numFacturaVirtual; }
    public Integer getIdResponsabilidad() { return idResponsabilidad; }
    public Integer getNumNotaCredito() { return numNotaCredito; }
    public Integer getNumNotaDebito() { return numNotaDebito; }
    public String getRemitenteCorreoForm() { return remitenteCorreoForm; }
    public String getAsuntoCorreoForm() { return asuntoCorreoForm; }
    public String getCuerpoCorreoForm() { return cuerpoCorreoForm; }
    public String getPasswordCorreoForm() { return passwordCorreoForm; }
    public String getCorreoFormularios() { return correoFormularios; }
    public String getMensajeTtoDatos() { return mensajeTtoDatos; }
    public String getCodigoREPSSede() { return codigoREPSSede; }
    public String getPrefijo() { return prefijo; }
    public java.time.LocalDateTime getFechaInicio() { return fechaInicio; }
    public java.time.LocalDateTime getFechaFin() { return fechaFin; }
    public Integer getIdMedico() { return idMedico; }
}
