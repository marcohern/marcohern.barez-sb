package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class AntecedentesEspecialidadesId implements Serializable {
    private Integer idAntecedente;
    private Integer idEspecialidad;

    public AntecedentesEspecialidadesId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AntecedentesEspecialidadesId that)) return false;
        return Objects.equals(idAntecedente, that.idAntecedente) && Objects.equals(idEspecialidad, that.idEspecialidad);
    }

    @Override
    public int hashCode() { return Objects.hash(idAntecedente, idEspecialidad); }
}
