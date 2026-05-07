package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RecursosMedicosId implements Serializable {
    private Integer idRecurso;
    private Integer idClasificacion;
    private Integer idEspecialidad;
    private Integer idMedico;

    public RecursosMedicosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecursosMedicosId that)) return false;
        return Objects.equals(idRecurso, that.idRecurso) && Objects.equals(idClasificacion, that.idClasificacion) && Objects.equals(idEspecialidad, that.idEspecialidad) && Objects.equals(idMedico, that.idMedico);
    }

    @Override
    public int hashCode() { return Objects.hash(idRecurso, idClasificacion, idEspecialidad, idMedico); }
}
