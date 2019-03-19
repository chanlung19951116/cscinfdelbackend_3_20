package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "EvidenciaEncontrada")
public class EvidenciaEncontrada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eeCodigo", nullable = false)
    private Integer eeCodigo;

    @Column(name = "eeDescripcion", nullable = false, length = 255)
    private String eeDescripcion;

    @Column(name = "eeCantidad", nullable = false)
    private Integer eeCantidad;

    @Column(name = "eeEstado", nullable = false)
    private Integer eeEstado;

}
