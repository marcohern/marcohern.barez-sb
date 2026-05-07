package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ServiciosPlanSaludId implements Serializable {
    private Integer idPlanSalud;
    private Integer idServicio;

    public ServiciosPlanSaludId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiciosPlanSaludId that)) return false;
        return Objects.equals(idPlanSalud, that.idPlanSalud) && Objects.equals(idServicio, that.idServicio);
    }

    @Override
    public int hashCode() { return Objects.hash(idPlanSalud, idServicio); }
}
