package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ServiciosRecursosId implements Serializable {
    private Integer idAuto;
    private Integer idRecurso;

    public ServiciosRecursosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiciosRecursosId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idRecurso, that.idRecurso);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idRecurso); }
}
