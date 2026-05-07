package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class PerfilesEmpleadoId implements Serializable {
    private Integer idEmpleado;
    private Integer idPerfil;

    public PerfilesEmpleadoId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerfilesEmpleadoId that)) return false;
        return Objects.equals(idEmpleado, that.idEmpleado) && Objects.equals(idPerfil, that.idPerfil);
    }

    @Override
    public int hashCode() { return Objects.hash(idEmpleado, idPerfil); }
}
