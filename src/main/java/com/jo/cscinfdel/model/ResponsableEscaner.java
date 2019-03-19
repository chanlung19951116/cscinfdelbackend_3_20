package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "ResponsableEscaner")
public class ResponsableEscaner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo", nullable = false)
    private Integer codigo;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "Telefono", nullable = false, length = 20)
    private String telefono;

    @Column(name = "Direccion", nullable = false, length = 255)
    private String direccion;

}
