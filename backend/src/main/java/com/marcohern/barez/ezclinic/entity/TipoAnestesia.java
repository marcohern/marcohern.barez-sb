package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoAnestesia")
public class TipoAnestesia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoAnestesia", nullable = false)
    private Integer idTipoAnestesia;

    @Column(name = "TipoAnestesia", length = 50)
    private String tipoAnestesia;

    public Integer getIdTipoAnestesia() { return idTipoAnestesia; }
    public String getTipoAnestesia() { return tipoAnestesia; }
}
