package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "EnfermedadesEmpresa")
public class EnfermedadesEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEnfermedad", nullable = false)
    private Integer idEnfermedad;

    @Column(name = "IdEmpresaPaciente")
    private Integer idEmpresaPaciente;

    @Column(name = "FechaEnfermedad")
    private java.time.LocalDateTime fechaEnfermedad;

    @Column(name = "IdTablaCIE")
    private Integer idTablaCIE;

    @Column(name = "IdDiagnostico")
    private Integer idDiagnostico;

    @Column(name = "DiasIncapacidad")
    private Integer diasIncapacidad;

    @Column(name = "Indemnizacion", length = 100)
    private String indemnizacion;

    @Column(name = "Reubicacion", length = 100)
    private String reubicacion;

    public Integer getIdEnfermedad() { return idEnfermedad; }
    public Integer getIdEmpresaPaciente() { return idEmpresaPaciente; }
    public java.time.LocalDateTime getFechaEnfermedad() { return fechaEnfermedad; }
    public Integer getIdTablaCIE() { return idTablaCIE; }
    public Integer getIdDiagnostico() { return idDiagnostico; }
    public Integer getDiasIncapacidad() { return diasIncapacidad; }
    public String getIndemnizacion() { return indemnizacion; }
    public String getReubicacion() { return reubicacion; }
}
