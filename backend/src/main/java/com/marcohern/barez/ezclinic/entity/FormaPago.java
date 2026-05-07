package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "FormaPago")
public class FormaPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFormaPago", nullable = false)
    private Integer idFormaPago;

    @Column(name = "FormaPago", length = 50)
    private String formaPago;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    @Column(name = "Codigo")
    private Integer codigo;

    public Integer getIdFormaPago() { return idFormaPago; }
    public String getFormaPago() { return formaPago; }
    public Boolean getSuspendido() { return suspendido; }
    public Integer getCodigo() { return codigo; }
}
