package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Usuarios")
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioCodigo", nullable = false)
    private Integer usuarioCodigo;

    @Column(name = "usuarioNmbre", nullable = false, length = 255)
    private String usuarioNmbre;

    @Column(name = "usuarioContrasena", nullable = false, length = 255)
    private String usuarioContrasena;

    @Column(name = "usuarioEstado", nullable = false, length = 3)
    private Integer usuarioEstado;

    @Column(name = "codigoRol", nullable = false)
    private Integer codigoRol;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoRol", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Rol rol;

}
