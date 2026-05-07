package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ExamenesEPSId implements Serializable {
    private Integer idEPS;
    private Integer idExamen;

    public ExamenesEPSId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExamenesEPSId that)) return false;
        return Objects.equals(idEPS, that.idEPS) && Objects.equals(idExamen, that.idExamen);
    }

    @Override
    public int hashCode() { return Objects.hash(idEPS, idExamen); }
}
