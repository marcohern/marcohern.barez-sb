package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class PerfilesContactoId implements Serializable {
    private Integer idContacto;
    private Integer idEPS;
    private Integer idPerfil;

    public PerfilesContactoId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerfilesContactoId that)) return false;
        return Objects.equals(idContacto, that.idContacto) && Objects.equals(idEPS, that.idEPS) && Objects.equals(idPerfil, that.idPerfil);
    }

    @Override
    public int hashCode() { return Objects.hash(idContacto, idEPS, idPerfil); }
}
