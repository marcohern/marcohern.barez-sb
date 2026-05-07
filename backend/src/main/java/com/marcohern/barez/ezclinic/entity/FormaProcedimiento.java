package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FormaProcedimiento")
public class FormaProcedimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFormaProcedimiento", nullable = false)
    private Integer idFormaProcedimiento;

    @Column(name = "FormaProcedimiento", length = 70)
    private String formaProcedimiento;

    public Integer getIdFormaProcedimiento() { return idFormaProcedimiento; }
    public String getFormaProcedimiento() { return formaProcedimiento; }
}
