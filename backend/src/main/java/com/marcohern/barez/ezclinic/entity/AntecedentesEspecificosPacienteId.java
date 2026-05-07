package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class AntecedentesEspecificosPacienteId implements Serializable {
    private Integer idPaciente;
    private Integer idAntecedente;

    public AntecedentesEspecificosPacienteId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AntecedentesEspecificosPacienteId that)) return false;
        return Objects.equals(idPaciente, that.idPaciente) && Objects.equals(idAntecedente, that.idAntecedente);
    }

    @Override
    public int hashCode() { return Objects.hash(idPaciente, idAntecedente); }
}
