package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ParametrosCitaId implements Serializable {
    private Integer idAuto;
    private Integer idPregunta;
    private Integer idParametro;

    public ParametrosCitaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParametrosCitaId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idPregunta, that.idPregunta) && Objects.equals(idParametro, that.idParametro);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idPregunta, idParametro); }
}
