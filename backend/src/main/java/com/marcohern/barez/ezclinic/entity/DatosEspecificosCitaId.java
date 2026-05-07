package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class DatosEspecificosCitaId implements Serializable {
    private Integer idAuto;
    private Integer idPregunta;

    public DatosEspecificosCitaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosEspecificosCitaId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idPregunta, that.idPregunta);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idPregunta); }
}
