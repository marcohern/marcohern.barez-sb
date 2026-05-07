package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class PreguntasServicioId implements Serializable {
    private Integer idServicio;
    private Integer idPregunta;

    public PreguntasServicioId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PreguntasServicioId that)) return false;
        return Objects.equals(idServicio, that.idServicio) && Objects.equals(idPregunta, that.idPregunta);
    }

    @Override
    public int hashCode() { return Objects.hash(idServicio, idPregunta); }
}
