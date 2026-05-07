package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class EspecialidadesMedicosId implements Serializable {
    private Integer idMedico;
    private Integer idEspecialidad;

    public EspecialidadesMedicosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EspecialidadesMedicosId that)) return false;
        return Objects.equals(idMedico, that.idMedico) && Objects.equals(idEspecialidad, that.idEspecialidad);
    }

    @Override
    public int hashCode() { return Objects.hash(idMedico, idEspecialidad); }
}
