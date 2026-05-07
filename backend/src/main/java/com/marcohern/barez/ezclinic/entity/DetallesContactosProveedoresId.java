package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class DetallesContactosProveedoresId implements Serializable {
    private Integer idContacto;
    private Integer idProveedor;

    public DetallesContactosProveedoresId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetallesContactosProveedoresId that)) return false;
        return Objects.equals(idContacto, that.idContacto) && Objects.equals(idProveedor, that.idProveedor);
    }

    @Override
    public int hashCode() { return Objects.hash(idContacto, idProveedor); }
}
