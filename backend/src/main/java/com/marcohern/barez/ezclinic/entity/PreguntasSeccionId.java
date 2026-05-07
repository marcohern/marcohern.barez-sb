package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class PreguntasSeccionId implements Serializable {
    private Integer idSeccion;
    private Integer idPregunta;

    public PreguntasSeccionId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PreguntasSeccionId that)) return false;
        return Objects.equals(idSeccion, that.idSeccion) && Objects.equals(idPregunta, that.idPregunta);
    }

    @Override
    public int hashCode() { return Objects.hash(idSeccion, idPregunta); }
}
