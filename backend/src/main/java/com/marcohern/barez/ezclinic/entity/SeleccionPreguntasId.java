package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class SeleccionPreguntasId implements Serializable {
    private Integer idPregunta;
    private Integer idSeleccion;

    public SeleccionPreguntasId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeleccionPreguntasId that)) return false;
        return Objects.equals(idPregunta, that.idPregunta) && Objects.equals(idSeleccion, that.idSeleccion);
    }

    @Override
    public int hashCode() { return Objects.hash(idPregunta, idSeleccion); }
}
