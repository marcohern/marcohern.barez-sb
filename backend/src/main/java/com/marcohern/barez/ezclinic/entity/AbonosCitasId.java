package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class AbonosCitasId implements Serializable {
    private Integer idAuto;
    private Integer reciboNo;

    public AbonosCitasId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbonosCitasId that)) return false;
        return Objects.equals(idAuto, that.idAuto) && Objects.equals(reciboNo, that.reciboNo);
    }

    @Override
    public int hashCode() { return Objects.hash(idAuto, reciboNo); }
}
