package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "TipoDocumento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoDocumento", nullable = false)
    private Integer idTipoDocumento;

    @Column(name = "TipoDocumento", nullable = false, length = 100)
    private String tipoDocumento;

    @Column(name = "Cantidad", nullable = false)
    private Short cantidad;

    @Column(name = "Extensiones", nullable = false, length = 255)
    private String extensiones;

    @Column(name = "Ordinal", nullable = false)
    private Short ordinal;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public Integer getIdTipoDocumento() { return idTipoDocumento; }
    public String getTipoDocumento() { return tipoDocumento; }
    public Short getCantidad() { return cantidad; }
    public String getExtensiones() { return extensiones; }
    public Short getOrdinal() { return ordinal; }
    public Boolean getSuspendido() { return suspendido; }
}
