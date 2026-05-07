package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ParametrosPreguntasId implements Serializable {
    private Integer idPregunta;
    private Integer idParametro;

    public ParametrosPreguntasId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParametrosPreguntasId that)) return false;
        return Objects.equals(idPregunta, that.idPregunta) && Objects.equals(idParametro, that.idParametro);
    }

    @Override
    public int hashCode() { return Objects.hash(idPregunta, idParametro); }
}
