package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RiesgosEmpresaId implements Serializable {
    private Integer idEmpresaPaciente;
    private Integer idRiesgo;

    public RiesgosEmpresaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RiesgosEmpresaId that)) return false;
        return Objects.equals(idEmpresaPaciente, that.idEmpresaPaciente) && Objects.equals(idRiesgo, that.idRiesgo);
    }

    @Override
    public int hashCode() { return Objects.hash(idEmpresaPaciente, idRiesgo); }
}
