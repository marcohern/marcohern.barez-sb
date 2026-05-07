package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class DisponibilidadRecursosId implements Serializable {
    private Integer idRecurso;
    private Boolean horarioSuspendido;

    public DisponibilidadRecursosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DisponibilidadRecursosId that)) return false;
        return Objects.equals(idRecurso, that.idRecurso) && Objects.equals(horarioSuspendido, that.horarioSuspendido);
    }

    @Override
    public int hashCode() { return Objects.hash(idRecurso, horarioSuspendido); }
}
