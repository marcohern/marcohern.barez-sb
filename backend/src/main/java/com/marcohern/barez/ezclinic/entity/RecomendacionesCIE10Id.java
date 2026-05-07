package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class RecomendacionesCIE10Id implements Serializable {
    private Integer idDiagnostico;
    private Integer idRecomendacion;

    public RecomendacionesCIE10Id() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecomendacionesCIE10Id that)) return false;
        return Objects.equals(idDiagnostico, that.idDiagnostico) && Objects.equals(idRecomendacion, that.idRecomendacion);
    }

    @Override
    public int hashCode() { return Objects.hash(idDiagnostico, idRecomendacion); }
}
