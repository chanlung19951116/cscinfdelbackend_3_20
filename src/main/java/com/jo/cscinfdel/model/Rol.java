package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Rol")
public class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo", nullable = false)
    private Integer codigo;

    @Column(name = "rolDescripcion", nullable = false, length = 255)
    private String rolDescripcion;

    @Column(name = "rolEstado", nullable = false)
    private Integer rolEstado;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "rol")
    private Set<MenuRol> menuRolList;

}
