package com.marcohern.barez.ezclinic.entity;

import java.io.Serializable;
import java.util.Objects;

public class ExamenesSolicitudesId implements Serializable {
    private Integer idExamen;
    private Long idSolicitud;

    public ExamenesSolicitudesId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExamenesSolicitudesId that)) return false;
        return Objects.equals(idExamen, that.idExamen) && Objects.equals(idSolicitud, that.idSolicitud);
    }

    @Override
    public int hashCode() { return Objects.hash(idExamen, idSolicitud); }
}
