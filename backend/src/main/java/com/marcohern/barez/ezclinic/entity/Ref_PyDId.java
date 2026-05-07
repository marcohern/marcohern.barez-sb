package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class Ref_PyDId implements Serializable {
    private String atencion;
    private String codigoprocedimiento;
    private String finalidad;

    public Ref_PyDId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ref_PyDId that)) return false;
        return Objects.equals(atencion, that.atencion) && Objects.equals(codigoprocedimiento, that.codigoprocedimiento) && Objects.equals(finalidad, that.finalidad);
    }

    @Override
    public int hashCode() { return Objects.hash(atencion, codigoprocedimiento, finalidad); }
}
