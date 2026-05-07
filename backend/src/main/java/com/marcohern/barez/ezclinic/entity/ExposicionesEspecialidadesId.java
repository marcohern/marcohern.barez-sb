package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ExposicionesEspecialidadesId implements Serializable {
    private Integer idExposicion;
    private Integer idEspecialidad;

    public ExposicionesEspecialidadesId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExposicionesEspecialidadesId that)) return false;
        return Objects.equals(idExposicion, that.idExposicion) && Objects.equals(idEspecialidad, that.idEspecialidad);
    }

    @Override
    public int hashCode() { return Objects.hash(idExposicion, idEspecialidad); }
}
