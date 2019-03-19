package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Barrio")
public class Barrio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "barrioCodigo", nullable = false)
    private Integer barrioCodigo;

    @Column(name = "barrioDescripcion", nullable = false, length = 255)
    private String barrioDescripcion;

    @Column(name = "barrioEstado", nullable = false)
    private Integer barrioEstado;

    @Column(name = "parroquiaCodigo", nullable = false)
    private Integer parroquiaCodigo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parroquiaCodigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia parroquia;

}
