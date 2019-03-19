package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "SustanciaMicroTrafico")
public class SustanciaMicroTrafico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "smtCodigo", nullable = false)
    private Integer smtCodigo;

    @Column(name = "smtDescripcion", nullable = false, length = 255)
    private String smtDescripcion;

    @Column(name = "smtCantidad", nullable = false)
    private Integer smtCantidad;

    @Column(name = "smtEstado", nullable = false)
    private Integer smtEstado;

}
