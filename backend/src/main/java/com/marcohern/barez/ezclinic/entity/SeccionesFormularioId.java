package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class SeccionesFormularioId implements Serializable {
    private Integer idSeccion;
    private Integer idFormulario;

    public SeccionesFormularioId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeccionesFormularioId that)) return false;
        return Objects.equals(idSeccion, that.idSeccion) && Objects.equals(idFormulario, that.idFormulario);
    }

    @Override
    public int hashCode() { return Objects.hash(idSeccion, idFormulario); }
}
