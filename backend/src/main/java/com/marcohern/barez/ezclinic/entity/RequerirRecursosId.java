package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RequerirRecursosId implements Serializable {
    private Integer idServicio;
    private Integer idClasificacion;

    public RequerirRecursosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequerirRecursosId that)) return false;
        return Objects.equals(idServicio, that.idServicio) && Objects.equals(idClasificacion, that.idClasificacion);
    }

    @Override
    public int hashCode() { return Objects.hash(idServicio, idClasificacion); }
}
