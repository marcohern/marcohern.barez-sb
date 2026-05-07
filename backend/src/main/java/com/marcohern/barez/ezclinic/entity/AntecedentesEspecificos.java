package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "AntecedentesEspecificos")
public class AntecedentesEspecificos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAntecedente", nullable = false)
    private Integer idAntecedente;

    @Column(name = "IdTipoAntecedente")
    private Integer idTipoAntecedente;

    @Column(name = "Antecedente", length = 200)
    private String antecedente;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdAntecedente() { return idAntecedente; }
    public Integer getIdTipoAntecedente() { return idTipoAntecedente; }
    public String getAntecedente() { return antecedente; }
    public Boolean getSuspendido() { return suspendido; }
}
