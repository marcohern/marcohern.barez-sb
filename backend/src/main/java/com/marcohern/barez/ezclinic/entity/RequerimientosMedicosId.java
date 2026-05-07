package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RequerimientosMedicosId implements Serializable {
    private Integer idEspecialidad;
    private Integer idServicio;

    public RequerimientosMedicosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequerimientosMedicosId that)) return false;
        return Objects.equals(idEspecialidad, that.idEspecialidad) && Objects.equals(idServicio, that.idServicio);
    }

    @Override
    public int hashCode() { return Objects.hash(idEspecialidad, idServicio); }
}
