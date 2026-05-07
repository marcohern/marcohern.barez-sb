package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RecomendacionesHistoriaId implements Serializable {
    private Integer idAuto;
    private Integer idRecomendacion;

    public RecomendacionesHistoriaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecomendacionesHistoriaId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idRecomendacion, that.idRecomendacion);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idRecomendacion); }
}
