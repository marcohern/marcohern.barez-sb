package com.marcohern.barez.ezclinic.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "Firmas")
public class Firmas {

    @Id
    @Column(name = "IdFirma", nullable = false, length = 20)
    private String idFirma;

    @Column(name = "FirmaDer")
    private byte[] firmaDer;

    @Column(name = "FirmaIzq")
    private byte[] firmaIzq;

    @Column(name = "Fotografia")
    private byte[] fotografia;

    @Column(name = "Logo")
    private byte[] logo;

    public String getIdFirma() { return idFirma; }
    public byte[] getFirmaDer() { return firmaDer; }
    public byte[] getFirmaIzq() { return firmaIzq; }
    public byte[] getFotografia() { return fotografia; }
    public byte[] getLogo() { return logo; }
}
