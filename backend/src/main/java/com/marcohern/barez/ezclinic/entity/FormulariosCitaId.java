package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class FormulariosCitaId implements Serializable {
    private Integer idAuto;
    private Integer idFormulario;
    private Integer idPregunta;

    public FormulariosCitaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FormulariosCitaId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idFormulario, that.idFormulario) && Objects.equals(idPregunta, that.idPregunta);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idFormulario, idPregunta); }
}
