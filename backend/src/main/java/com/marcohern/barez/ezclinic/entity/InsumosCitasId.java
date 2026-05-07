package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class InsumosCitasId implements Serializable {
    private Integer idAuto;
    private Integer idInsumo;

    public InsumosCitasId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsumosCitasId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idInsumo, that.idInsumo);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idInsumo); }
}
