package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "ModeloVehiculo")
public class ModeloVehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo", nullable = false)
    private Integer codigo;

    @Column(name = "Descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "Estado", nullable = false)
    private Integer estado;

    @Column(name = "marcaModeloVehiculo", nullable = false)
    private Integer marcaModeloVehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "marcaModeloVehiculo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private MarcaVehiculo marcaVehiculo;

}
