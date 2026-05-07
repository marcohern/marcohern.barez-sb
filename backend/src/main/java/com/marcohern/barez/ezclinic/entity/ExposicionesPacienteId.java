package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ExposicionesPacienteId implements Serializable {
    private Integer idPaciente;
    private Integer idExposicion;

    public ExposicionesPacienteId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExposicionesPacienteId that)) return false;
        return Objects.equals(idPaciente, that.idPaciente) && Objects.equals(idExposicion, that.idExposicion);
    }

    @Override
    public int hashCode() { return Objects.hash(idPaciente, idExposicion); }
}
