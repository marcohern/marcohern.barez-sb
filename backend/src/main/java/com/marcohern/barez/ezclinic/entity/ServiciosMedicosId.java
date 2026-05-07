package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ServiciosMedicosId implements Serializable {
    private Integer idAuto;
    private Integer idMedico;

    public ServiciosMedicosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiciosMedicosId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idMedico, that.idMedico);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idMedico); }
}
