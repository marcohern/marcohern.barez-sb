package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RequerirInsumosId implements Serializable {
    private Integer idServicio;
    private Integer idInsumo;

    public RequerirInsumosId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequerirInsumosId that)) return false;
        return Objects.equals(idServicio, that.idServicio) && Objects.equals(idInsumo, that.idInsumo);
    }

    @Override
    public int hashCode() { return Objects.hash(idServicio, idInsumo); }
}
