package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Fiscalia")
public class Fiscalia implements Serializable {

    @Id
    @Column(name = "fiscaliaCodigo", nullable = false, length = 10)
    private String fiscaliaCodigo;

    @Column(name = "fiscaliaNombre", nullable = false, length = 50)
    private String fiscaliaNombre;

    @Column(name = "fiscaliaDireccion", nullable = false, length = 255)
    private String fiscaliaDireccion;

    @Column(name = "fiscaliaTelefono", nullable = false, length = 30)
    private String fiscaliaTelefono;

    @Column(name = "fiscaliaEstado", nullable = false)
    private Integer fiscaliaEstado;

}
