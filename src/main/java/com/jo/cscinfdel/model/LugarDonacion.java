package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "LugarDonacion")
public class LugarDonacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo", nullable = false)
    private Integer codigo;

    @Column(name = "Descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "Estado", nullable = false)
    private Integer estado;

    @Column(name = "Direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "Telefono", nullable = false, length = 50)
    private String telefono;

    @Column(name = "Contacto", nullable = false, length = 100)
    private String contacto;



}
