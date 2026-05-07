package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class DisponibilidadMedicosId implements Serializable {
    private Integer idMedico;
    private Integer idClasificacion;
    private Boolean horarioSuspendido;

    public DisponibilidadMedicosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DisponibilidadMedicosId that)) return false;
        return Objects.equals(idMedico, that.idMedico) && Objects.equals(idClasificacion, that.idClasificacion) && Objects.equals(horarioSuspendido, that.horarioSuspendido);
    }

    @Override
    public int hashCode() { return Objects.hash(idMedico, idClasificacion, horarioSuspendido); }
}
