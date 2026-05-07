package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

// NOTE: source table has no primary key. Synthetic IdClass composed of all non-nullable columns.
// Rows containing NULLs across all candidate-id columns may be unfetchable via JPA.
@Entity
@Immutable
@Table(name = "Ref_PyD")
@IdClass(Ref_PyDId.class)
public class Ref_PyD {

    @Id
    @Column(name = "atencion", nullable = false, length = 3)
    private String atencion;

    @Id
    @Column(name = "Codigoprocedimiento", nullable = false, length = 6)
    private String codigoprocedimiento;

    @Id
    @Column(name = "Finalidad", nullable = false, length = 2)
    private String finalidad;

    @Column(name = "causaExterna")
    private Short causaExterna;

    @Column(name = "diagnostico", length = 4)
    private String diagnostico;

    public String getAtencion() { return atencion; }
    public String getCodigoprocedimiento() { return codigoprocedimiento; }
    public String getFinalidad() { return finalidad; }
    public Short getCausaExterna() { return causaExterna; }
    public String getDiagnostico() { return diagnostico; }
}
