package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ArchivosSolicitudesId implements Serializable {
    private Long idArchivo;
    private Long idSolicitud;

    public ArchivosSolicitudesId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArchivosSolicitudesId that)) return false;
        return Objects.equals(idArchivo, that.idArchivo) && Objects.equals(idSolicitud, that.idSolicitud);
    }

    @Override
    public int hashCode() { return Objects.hash(idArchivo, idSolicitud); }
}
