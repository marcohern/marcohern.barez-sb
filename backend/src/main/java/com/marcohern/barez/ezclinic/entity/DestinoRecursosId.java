package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class DestinoRecursosId implements Serializable {
    private Integer idRecurso;
    private Integer idEspecialidad;
    private Integer idClasificacion;

    public DestinoRecursosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DestinoRecursosId that)) return false;
        return Objects.equals(idRecurso, that.idRecurso) && Objects.equals(idEspecialidad, that.idEspecialidad) && Objects.equals(idClasificacion, that.idClasificacion);
    }

    @Override
    public int hashCode() { return Objects.hash(idRecurso, idEspecialidad, idClasificacion); }
}
