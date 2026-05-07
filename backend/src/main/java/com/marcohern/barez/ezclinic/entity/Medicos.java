package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Medicos")
public class Medicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMedico", nullable = false)
    private Integer idMedico;

    @Column(name = "Apellidos", length = 50)
    private String apellidos;

    @Column(name = "Nombres", length = 50)
    private String nombres;

    @Column(name = "NombreCompletoMedico", length = 120)
    private String nombreCompletoMedico;

    @Column(name = "IdTipoIdentificacion")
    private Integer idTipoIdentificacion;

    @Column(name = "Identificacion", length = 50)
    private String identificacion;

    @Column(name = "IdEstadoCivil")
    private Integer idEstadoCivil;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "FechaNacimiento")
    private java.time.LocalDateTime fechaNacimiento;

    @Column(name = "FechaIngreso")
    private java.time.LocalDateTime fechaIngreso;

    @Column(name = "RegistroMedico", length = 50)
    private String registroMedico;

    @Column(name = "Direccion", length = 50)
    private String direccion;

    @Column(name = "IdCiudad")
    private Integer idCiudad;

    @Column(name = "IdZonaResidencia")
    private Integer idZonaResidencia;

    @Column(name = "Telefono", length = 50)
    private String telefono;

    @Column(name = "Extension", length = 50)
    private String extension;

    @Column(name = "Celular", length = 50)
    private String celular;

    @Column(name = "Beeper", length = 50)
    private String beeper;

    @Column(name = "CodBeeper", length = 50)
    private String codBeeper;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "UbiAlterna", length = 50)
    private String ubiAlterna;

    @Column(name = "DirUbiAlterna", length = 50)
    private String dirUbiAlterna;

    @Column(name = "TelUbiAlterna", length = 50)
    private String telUbiAlterna;

    @Column(name = "ExtUbiAlterna", length = 50)
    private String extUbiAlterna;

    @Column(name = "FotoGrafia", length = 50)
    private String fotoGrafia;

    @Column(name = "Contraseña", length = 15)
    private String contraseA;

    @Column(name = "TmpUltCita", length = 50)
    private String tmpUltCita;

    @Column(name = "MedSuspendido", nullable = false)
    private Boolean medSuspendido;

    @Column(name = "LicenciaSaludOcupacional", length = 50)
    private String licenciaSaludOcupacional;

    @Column(name = "FotoFirma", length = 50)
    private String fotoFirma;

    @Column(name = "Notificacion")
    private String notificacion;

    @Column(name = "MensajeLeido", nullable = false)
    private Boolean mensajeLeido;

    public Integer getIdMedico() { return idMedico; }
    public String getApellidos() { return apellidos; }
    public String getNombres() { return nombres; }
    public String getNombreCompletoMedico() { return nombreCompletoMedico; }
    public Integer getIdTipoIdentificacion() { return idTipoIdentificacion; }
    public String getIdentificacion() { return identificacion; }
    public Integer getIdEstadoCivil() { return idEstadoCivil; }
    public Integer getIdSexo() { return idSexo; }
    public java.time.LocalDateTime getFechaNacimiento() { return fechaNacimiento; }
    public java.time.LocalDateTime getFechaIngreso() { return fechaIngreso; }
    public String getRegistroMedico() { return registroMedico; }
    public String getDireccion() { return direccion; }
    public Integer getIdCiudad() { return idCiudad; }
    public Integer getIdZonaResidencia() { return idZonaResidencia; }
    public String getTelefono() { return telefono; }
    public String getExtension() { return extension; }
    public String getCelular() { return celular; }
    public String getBeeper() { return beeper; }
    public String getCodBeeper() { return codBeeper; }
    public String getEmail() { return email; }
    public String getUbiAlterna() { return ubiAlterna; }
    public String getDirUbiAlterna() { return dirUbiAlterna; }
    public String getTelUbiAlterna() { return telUbiAlterna; }
    public String getExtUbiAlterna() { return extUbiAlterna; }
    public String getFotoGrafia() { return fotoGrafia; }
    public String getContraseA() { return contraseA; }
    public String getTmpUltCita() { return tmpUltCita; }
    public Boolean getMedSuspendido() { return medSuspendido; }
    public String getLicenciaSaludOcupacional() { return licenciaSaludOcupacional; }
    public String getFotoFirma() { return fotoFirma; }
    public String getNotificacion() { return notificacion; }
    public Boolean getMensajeLeido() { return mensajeLeido; }
}
