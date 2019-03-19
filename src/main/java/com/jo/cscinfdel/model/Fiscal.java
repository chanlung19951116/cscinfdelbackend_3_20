package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Fiscal")
public class Fiscal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiscalCodigo", nullable = false)
    private Integer fiscalCodigo;

    @Column(name = "fiscalNombre", nullable = false, length = 50)
    private String fiscalNombre;

    @Column(name = "fiscalTelefono", nullable = false, length = 30)
    private String fiscalTelefono;

    @Column(name = "fiscalEstado", nullable = false)
    private Integer fiscalEstado;

    @Column(name = "fiscaliaCodigo", nullable = false)
    private String fiscaliaCodigo;

}
