package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "ServiciosMedicos")
@IdClass(ServiciosMedicosId.class)
public class ServiciosMedicos {

    @Id
    @Column(name = "IdAuto", nullable = false)
    private Integer idAuto;

    @Id
    @Column(name = "IdMedico", nullable = false)
    private Integer idMedico;

    @Column(name = "MedicoPrincipal", nullable = false)
    private Boolean medicoPrincipal;

    @Column(name = "HonorariosMedico")
    private java.math.BigDecimal honorariosMedico;

    public Integer getIdAuto() { return idAuto; }
    public Integer getIdMedico() { return idMedico; }
    public Boolean getMedicoPrincipal() { return medicoPrincipal; }
    public java.math.BigDecimal getHonorariosMedico() { return honorariosMedico; }
}
