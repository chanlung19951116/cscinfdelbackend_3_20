package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Medico")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicoCodigo", nullable = false)
    private Integer medicoCodigo;
    @Column(name = "medicoIdentificacion", nullable = false)
    private Integer medicoIdentificacion;

    @Column(name = "medicoNombres", nullable = false, length = 50)
    private String medicoNombres;
    @Column(name = "medicoApellidos", nullable = false, length = 50)
    private String medicoApellidos;
    @Column(name = "medicoTelefono", nullable = false, length = 30)
    private String medicoTelefono;
    @Column(name = "medicoDireccion", nullable = false, length = 255)
    private String medicoDireccion;

    @Column(name = "medicoEstado", nullable = false)
    private Integer medicoEstado;

    @Column(name = "NombreCompleto", nullable = false, length = 100)
    private String nombreCompleto;

}
