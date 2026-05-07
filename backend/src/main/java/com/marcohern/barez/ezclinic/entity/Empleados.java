package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Empleados")
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleado", nullable = false)
    private Integer idEmpleado;

    @Column(name = "IdTipoEmpleado")
    private Integer idTipoEmpleado;

    @Column(name = "IdExterno")
    private Integer idExterno;

    @Column(name = "Apellidos", length = 50)
    private String apellidos;

    @Column(name = "Nombres", length = 50)
    private String nombres;

    @Column(name = "NombreCompletoEmpleado", length = 100)
    private String nombreCompletoEmpleado;

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

    @Column(name = "IdNivel")
    private Integer idNivel;

    @Column(name = "Cargo", length = 50)
    private String cargo;

    @Column(name = "JefeInmediato", length = 50)
    private String jefeInmediato;

    @Column(name = "HoraEntrada")
    private java.time.LocalDateTime horaEntrada;

    @Column(name = "HoraSalida")
    private java.time.LocalDateTime horaSalida;

    @Column(name = "FotoGrafia", length = 50)
    private String fotoGrafia;

    @Column(name = "Login", nullable = false, length = 40)
    private String login;

    @Column(name = "Contraseña", length = 15)
    private String contraseA;

    @Column(name = "Permisos", length = 11)
    private String permisos;

    @Column(name = "EmpSuspendido", nullable = false)
    private Boolean empSuspendido;

    @Column(name = "ResetPassword", nullable = false)
    private Boolean resetPassword;

    @Column(name = "Notificacion")
    private String notificacion;

    @Column(name = "MensajeLeido", nullable = false)
    private Boolean mensajeLeido;

    public Integer getIdEmpleado() { return idEmpleado; }
    public Integer getIdTipoEmpleado() { return idTipoEmpleado; }
    public Integer getIdExterno() { return idExterno; }
    public String getApellidos() { return apellidos; }
    public String getNombres() { return nombres; }
    public String getNombreCompletoEmpleado() { return nombreCompletoEmpleado; }
    public Integer getIdTipoIdentificacion() { return idTipoIdentificacion; }
    public String getIdentificacion() { return identificacion; }
    public Integer getIdEstadoCivil() { return idEstadoCivil; }
    public Integer getIdSexo() { return idSexo; }
    public java.time.LocalDateTime getFechaNacimiento() { return fechaNacimiento; }
    public java.time.LocalDateTime getFechaIngreso() { return fechaIngreso; }
    public String getDireccion() { return direccion; }
    public Integer getIdCiudad() { return idCiudad; }
    public Integer getIdZonaResidencia() { return idZonaResidencia; }
    public String getTelefono() { return telefono; }
    public String getExtension() { return extension; }
    public String getCelular() { return celular; }
    public String getBeeper() { return beeper; }
    public String getCodBeeper() { return codBeeper; }
    public String getEmail() { return email; }
    public Integer getIdNivel() { return idNivel; }
    public String getCargo() { return cargo; }
    public String getJefeInmediato() { return jefeInmediato; }
    public java.time.LocalDateTime getHoraEntrada() { return horaEntrada; }
    public java.time.LocalDateTime getHoraSalida() { return horaSalida; }
    public String getFotoGrafia() { return fotoGrafia; }
    public String getLogin() { return login; }
    public String getContraseA() { return contraseA; }
    public String getPermisos() { return permisos; }
    public Boolean getEmpSuspendido() { return empSuspendido; }
    public Boolean getResetPassword() { return resetPassword; }
    public String getNotificacion() { return notificacion; }
    public Boolean getMensajeLeido() { return mensajeLeido; }
}
