package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class DependenciasIPSId implements Serializable {
    private Integer idIPS;
    private Integer idDependencia;

    public DependenciasIPSId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DependenciasIPSId that)) return false;
        return Objects.equals(idIPS, that.idIPS) && Objects.equals(idDependencia, that.idDependencia);
    }

    @Override
    public int hashCode() { return Objects.hash(idIPS, idDependencia); }
}
