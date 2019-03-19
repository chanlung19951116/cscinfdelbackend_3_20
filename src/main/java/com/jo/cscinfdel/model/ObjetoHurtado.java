package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "ObjetoHurtado")
public class ObjetoHurtado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo", nullable = false)
    private Integer codigo;

    @Column(name = "Descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "Estado", nullable = false)
    private Integer estado;

    @Column(name = "Marca", nullable = false, length = 20)
    private String marca;

    @Column(name = "Cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "Valor", nullable = false)
    private Float valor;

}
