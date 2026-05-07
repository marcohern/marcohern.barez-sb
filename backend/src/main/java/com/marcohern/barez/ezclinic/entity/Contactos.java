package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Contactos")
public class Contactos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdContacto", nullable = false)
    private Integer idContacto;

    @Column(name = "Apellidos", length = 50)
    private String apellidos;

    @Column(name = "Nombres", length = 50)
    private String nombres;

    @Column(name = "IdTratamiento")
    private Integer idTratamiento;

    @Column(name = "IdTipoIdentificacion")
    private Integer idTipoIdentificacion;

    @Column(name = "Identificacion", length = 50)
    private String identificacion;

    @Column(name = "IdEstadoCivil")
    private Integer idEstadoCivil;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "Direccion", length = 50)
    private String direccion;

    @Column(name = "IdCiudad")
    private Integer idCiudad;

    @Column(name = "IdZonaResidencia")
    private Integer idZonaResidencia;

    @Column(name = "TelefonoResidencia", length = 15)
    private String telefonoResidencia;

    @Column(name = "Celular", length = 15)
    private String celular;

    @Column(name = "Beeper", length = 15)
    private String beeper;

    @Column(name = "CodigoBeeper", length = 15)
    private String codigoBeeper;

    @Column(name = "TelefonoOficina", length = 15)
    private String telefonoOficina;

    @Column(name = "Extension", length = 15)
    private String extension;

    @Column(name = "CorreoElectronico", length = 100)
    private String correoElectronico;

    @Column(name = "ContactoSuspendido", nullable = false)
    private Boolean contactoSuspendido;

    @Column(name = "Notas")
    private String notas;

    @Column(name = "NombreCompletoContacto", length = 100)
    private String nombreCompletoContacto;

    @Column(name = "RegistroMedico", length = 50)
    private String registroMedico;

    @Column(name = "Notificacion")
    private String notificacion;

    @Column(name = "MensajeLeido")
    private Boolean mensajeLeido;

    public Integer getIdContacto() { return idContacto; }
    public String getApellidos() { return apellidos; }
    public String getNombres() { return nombres; }
    public Integer getIdTratamiento() { return idTratamiento; }
    public Integer getIdTipoIdentificacion() { return idTipoIdentificacion; }
    public String getIdentificacion() { return identificacion; }
    public Integer getIdEstadoCivil() { return idEstadoCivil; }
    public Integer getIdSexo() { return idSexo; }
    public String getDireccion() { return direccion; }
    public Integer getIdCiudad() { return idCiudad; }
    public Integer getIdZonaResidencia() { return idZonaResidencia; }
    public String getTelefonoResidencia() { return telefonoResidencia; }
    public String getCelular() { return celular; }
    public String getBeeper() { return beeper; }
    public String getCodigoBeeper() { return codigoBeeper; }
    public String getTelefonoOficina() { return telefonoOficina; }
    public String getExtension() { return extension; }
    public String getCorreoElectronico() { return correoElectronico; }
    public Boolean getContactoSuspendido() { return contactoSuspendido; }
    public String getNotas() { return notas; }
    public String getNombreCompletoContacto() { return nombreCompletoContacto; }
    public String getRegistroMedico() { return registroMedico; }
    public String getNotificacion() { return notificacion; }
    public Boolean getMensajeLeido() { return mensajeLeido; }
}
