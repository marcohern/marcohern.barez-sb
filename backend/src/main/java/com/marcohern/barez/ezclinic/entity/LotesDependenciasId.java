package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class LotesDependenciasId implements Serializable {
    private Integer idLote;
    private Integer idDependencia;

    public LotesDependenciasId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LotesDependenciasId that)) return false;
        return Objects.equals(idLote, that.idLote) && Objects.equals(idDependencia, that.idDependencia);
    }

    @Override
    public int hashCode() { return Objects.hash(idLote, idDependencia); }
}
