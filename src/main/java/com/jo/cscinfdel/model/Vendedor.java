package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Vendedor")
public class Vendedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoVendedor", nullable = false, length = 10)
    private Integer codigoVendedor;

    @Column(name = "Identificacion", nullable = false, length = 20)
    private String identificacion;

    @Column(name = "Nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name = "Apellidos", nullable = false, length = 50)
    private String apellidos;

    @Column(name = "Telefonos", nullable = false, length = 30)
    private String telefonos;

    @Column(name = "Direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "Edad", nullable = false)
    private Integer edad;

    @Column(name = "Estado", nullable = false)
    private Integer estado;

    @Column(name = "Sexo", nullable = false)
    private Integer sexo;

    @Column(name = "VendedorNombreCompleto", nullable = false, length = 100)
    private String vendedorNombreCompleto;


}
