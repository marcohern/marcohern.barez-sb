package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ServicioPadreId implements Serializable {
    private Integer idAuto;
    private Integer idAuto1;

    public ServicioPadreId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServicioPadreId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(idAuto1, that.idAuto1);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, idAuto1); }
}
