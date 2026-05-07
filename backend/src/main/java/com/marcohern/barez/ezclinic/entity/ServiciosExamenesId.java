package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ServiciosExamenesId implements Serializable {
    private Integer idServicio;
    private Integer idExamen;

    public ServiciosExamenesId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiciosExamenesId that)) return false;
        return Objects.equals(idServicio, that.idServicio) && Objects.equals(idExamen, that.idExamen);
    }

    @Override
    public int hashCode() { return Objects.hash(idServicio, idExamen); }
}
