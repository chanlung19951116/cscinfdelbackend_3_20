package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoTipoUsuario", nullable = false)
    private Integer codigoTipoUsuario;

    @Column(name = "descripcionTipoUsuario", nullable = false, length = 255)
    private String descripcionTipoUsuario;

    @Column(name = "estadoTipoUsuario", nullable = false, length = 3)
    private String estadoTipoUsuario;

    @Column(name = "codigoRol", nullable = false)
    private Integer codigoRol;

}
