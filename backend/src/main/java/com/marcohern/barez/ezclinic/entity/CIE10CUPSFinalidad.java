package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CIE10CUPSFinalidad")
public class CIE10CUPSFinalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCIE10CUPSFinalidad", nullable = false)
    private Integer idCIE10CUPSFinalidad;

    @Column(name = "IdCUPS", nullable = false, length = 6)
    private String idCUPS;

    @Column(name = "IdFinalidad", nullable = false)
    private Integer idFinalidad;

    @Column(name = "IdDiagnostico")
    private Integer idDiagnostico;

    public Integer getIdCIE10CUPSFinalidad() { return idCIE10CUPSFinalidad; }
    public String getIdCUPS() { return idCUPS; }
    public Integer getIdFinalidad() { return idFinalidad; }
    public Integer getIdDiagnostico() { return idDiagnostico; }
}
