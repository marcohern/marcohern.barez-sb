package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ResponsabilidadesIPSId implements Serializable {
    private Integer idIPS;
    private Integer idResponsabilidad;

    public ResponsabilidadesIPSId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponsabilidadesIPSId that)) return false;
        return Objects.equals(idIPS, that.idIPS) && Objects.equals(idResponsabilidad, that.idResponsabilidad);
    }

    @Override
    public int hashCode() { return Objects.hash(idIPS, idResponsabilidad); }
}
