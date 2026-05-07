package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Pacientes")
public class Pacientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPaciente", nullable = false)
    private Integer idPaciente;

    @Column(name = "IdTipoIdentificacion")
    private Integer idTipoIdentificacion;

    @Column(name = "Identificacion", length = 20)
    private String identificacion;

    @Column(name = "Carnet", length = 20)
    private String carnet;

    @Column(name = "PrimApellido", length = 30)
    private String primApellido;

    @Column(name = "SegApellido", length = 30)
    private String segApellido;

    @Column(name = "PrimNombre", length = 20)
    private String primNombre;

    @Column(name = "SegNombre", length = 20)
    private String segNombre;

    @Column(name = "NombreCompleto", length = 100)
    private String nombreCompleto;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "IdEstadoCivil")
    private Integer idEstadoCivil;

    @Column(name = "FechaNacimiento")
    private java.time.LocalDateTime fechaNacimiento;

    @Column(name = "FechaIngreso")
    private java.time.LocalDateTime fechaIngreso;

    @Column(name = "IdOcupacion")
    private Integer idOcupacion;

    @Column(name = "IdPlanSalud")
    private Integer idPlanSalud;

    @Column(name = "Direccion", length = 50)
    private String direccion;

    @Column(name = "IdZonaResidencia")
    private Integer idZonaResidencia;

    @Column(name = "IdCiudad")
    private Integer idCiudad;

    @Column(name = "Telefono", length = 50)
    private String telefono;

    @Column(name = "Estrato", length = 2)
    private String estrato;

    @Column(name = "Acudiente", length = 50)
    private String acudiente;

    @Column(name = "TelAcudiente", length = 20)
    private String telAcudiente;

    @Column(name = "NumHisto", length = 50)
    private String numHisto;

    @Column(name = "PacienteSuspendido", nullable = false)
    private Boolean pacienteSuspendido;

    @Column(name = "CotizanteIdent", length = 20)
    private String cotizanteIdent;

    @Column(name = "IdParentezco")
    private Integer idParentezco;

    @Column(name = "Fotografia", length = 50)
    private String fotografia;

    @Column(name = "TelOficina", length = 15)
    private String telOficina;

    @Column(name = "Celular", length = 15)
    private String celular;

    @Column(name = "Beeper", length = 15)
    private String beeper;

    @Column(name = "EMail", length = 50)
    private String eMail;

    @Column(name = "AA", length = 15)
    private String aA;

    @Column(name = "Padre", length = 50)
    private String padre;

    @Column(name = "Madre", length = 50)
    private String madre;

    @Column(name = "Notas")
    private String notas;

    @Column(name = "IdEducacion")
    private Integer idEducacion;

    @Column(name = "IdCargo")
    private Integer idCargo;

    @Column(name = "IdEps")
    private Integer idEps;

    @Column(name = "IdEmpresa")
    private Integer idEmpresa;

    @Column(name = "FotoFirma", length = 50)
    private String fotoFirma;

    @Column(name = "IdAFP")
    private Integer idAFP;

    @Column(name = "IdARP")
    private Integer idARP;

    @Column(name = "OldId")
    private Integer oldId;

    @Column(name = "ID_TERCERO", length = 20)
    private String iD_TERCERO;

    @Column(name = "IdPaisOrigen", nullable = false)
    private Integer idPaisOrigen;

    public Integer getIdPaciente() { return idPaciente; }
    public Integer getIdTipoIdentificacion() { return idTipoIdentificacion; }
    public String getIdentificacion() { return identificacion; }
    public String getCarnet() { return carnet; }
    public String getPrimApellido() { return primApellido; }
    public String getSegApellido() { return segApellido; }
    public String getPrimNombre() { return primNombre; }
    public String getSegNombre() { return segNombre; }
    public String getNombreCompleto() { return nombreCompleto; }
    public Integer getIdSexo() { return idSexo; }
    public Integer getIdEstadoCivil() { return idEstadoCivil; }
    public java.time.LocalDateTime getFechaNacimiento() { return fechaNacimiento; }
    public java.time.LocalDateTime getFechaIngreso() { return fechaIngreso; }
    public Integer getIdOcupacion() { return idOcupacion; }
    public Integer getIdPlanSalud() { return idPlanSalud; }
    public String getDireccion() { return direccion; }
    public Integer getIdZonaResidencia() { return idZonaResidencia; }
    public Integer getIdCiudad() { return idCiudad; }
    public String getTelefono() { return telefono; }
    public String getEstrato() { return estrato; }
    public String getAcudiente() { return acudiente; }
    public String getTelAcudiente() { return telAcudiente; }
    public String getNumHisto() { return numHisto; }
    public Boolean getPacienteSuspendido() { return pacienteSuspendido; }
    public String getCotizanteIdent() { return cotizanteIdent; }
    public Integer getIdParentezco() { return idParentezco; }
    public String getFotografia() { return fotografia; }
    public String getTelOficina() { return telOficina; }
    public String getCelular() { return celular; }
    public String getBeeper() { return beeper; }
    public String getEMail() { return eMail; }
    public String getAA() { return aA; }
    public String getPadre() { return padre; }
    public String getMadre() { return madre; }
    public String getNotas() { return notas; }
    public Integer getIdEducacion() { return idEducacion; }
    public Integer getIdCargo() { return idCargo; }
    public Integer getIdEps() { return idEps; }
    public Integer getIdEmpresa() { return idEmpresa; }
    public String getFotoFirma() { return fotoFirma; }
    public Integer getIdAFP() { return idAFP; }
    public Integer getIdARP() { return idARP; }
    public Integer getOldId() { return oldId; }
    public String getID_TERCERO() { return iD_TERCERO; }
    public Integer getIdPaisOrigen() { return idPaisOrigen; }
}
