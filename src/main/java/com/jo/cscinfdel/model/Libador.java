package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Libador")
public class Libador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lbCodigoLibador", nullable = false)
    private Integer lbCodigoLibador;

    @Column(name = "lbNombres", nullable = false, length = 50)
    private String lbNombres;

    @Column(name = "lbApellidos", nullable = false, length = 50)
    private String lbApellidos;

    @Column(name = "lbTelefonos", nullable = false, length = 50)
    private String lbTelefonos;

    @Column(name = "lbDireccion", nullable = false, length = 255)
    private String lbDireccion;

    @Column(name = "lbEdad", nullable = false)
    private Integer lbEdad;

    @Column(name = "lbContacto", nullable = false, length = 50)
    private String lbContacto;

    @Column(name = "lbEstado", nullable = false)
    private Integer lbEstado;

    @Column(name = "lbSexo", nullable = false)
    private Integer lbSexo;

    @Column(name = "lbNombreCompleto", nullable = false, length = 100)
    private String lbNombreCompleto;

}
