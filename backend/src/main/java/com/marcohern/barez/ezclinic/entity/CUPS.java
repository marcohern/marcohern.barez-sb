package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CUPS")
public class CUPS {

    @Id
    @Column(name = "IdServicio", nullable = false, length = 8)
    private String idServicio;

    @Column(name = "NombreServicio", length = 255)
    private String nombreServicio;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "ServicioNoCUPS", nullable = false)
    private Boolean servicioNoCUPS;

    @Column(name = "IdSexo")
    private Integer idSexo;

    @Column(name = "TiempoMin")
    private Float tiempoMin;

    @Column(name = "TiempoMax")
    private Float tiempoMax;

    @Column(name = "MaxVecesDia")
    private Integer maxVecesDia;

    @Column(name = "MaxVecesVida")
    private Integer maxVecesVida;

    @Column(name = "TiempoLimiteDias")
    private Integer tiempoLimiteDias;

    @Column(name = "EsQuirurgico")
    private Boolean esQuirurgico;

    @Column(name = "TipoAtencion", length = 2)
    private String tipoAtencion;

    @Column(name = "Suspendido", nullable = false)
    private Boolean suspendido;

    public String getIdServicio() { return idServicio; }
    public String getNombreServicio() { return nombreServicio; }
    public String getDescripcion() { return descripcion; }
    public Boolean getServicioNoCUPS() { return servicioNoCUPS; }
    public Integer getIdSexo() { return idSexo; }
    public Float getTiempoMin() { return tiempoMin; }
    public Float getTiempoMax() { return tiempoMax; }
    public Integer getMaxVecesDia() { return maxVecesDia; }
    public Integer getMaxVecesVida() { return maxVecesVida; }
    public Integer getTiempoLimiteDias() { return tiempoLimiteDias; }
    public Boolean getEsQuirurgico() { return esQuirurgico; }
    public String getTipoAtencion() { return tipoAtencion; }
    public Boolean getSuspendido() { return suspendido; }
}
