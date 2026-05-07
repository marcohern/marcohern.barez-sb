package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class DetallesContactoEpsId implements Serializable {
    private Integer idContacto;
    private Integer idEPS;

    public DetallesContactoEpsId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetallesContactoEpsId that)) return false;
        return Objects.equals(idContacto, that.idContacto) && Objects.equals(idEPS, that.idEPS);
    }

    @Override
    public int hashCode() { return Objects.hash(idContacto, idEPS); }
}
