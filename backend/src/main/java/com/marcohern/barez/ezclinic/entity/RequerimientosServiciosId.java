package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RequerimientosServiciosId implements Serializable {
    private Integer idServicio;
    private Integer idServicio1;

    public RequerimientosServiciosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequerimientosServiciosId that)) return false;
        return Objects.equals(idServicio, that.idServicio) && Objects.equals(idServicio1, that.idServicio1);
    }

    @Override
    public int hashCode() { return Objects.hash(idServicio, idServicio1); }
}
