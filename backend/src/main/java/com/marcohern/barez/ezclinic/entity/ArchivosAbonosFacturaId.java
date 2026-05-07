package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ArchivosAbonosFacturaId implements Serializable {
    private Long idArchivo;
    private Integer idAbono;

    public ArchivosAbonosFacturaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArchivosAbonosFacturaId that)) return false;
        return Objects.equals(idArchivo, that.idArchivo) && Objects.equals(idAbono, that.idAbono);
    }

    @Override
    public int hashCode() { return Objects.hash(idArchivo, idAbono); }
}
