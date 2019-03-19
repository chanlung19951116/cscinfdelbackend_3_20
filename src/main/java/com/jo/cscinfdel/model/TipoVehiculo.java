package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "TipoVehiculo")
public class TipoVehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoVehiculoCodigo", nullable = false)
    private Integer tipoVehiculoCodigo;

    @Column(name = "tipoVehiculoDescripcion", nullable = false, length = 255)
    private String tipoVehiculoDescripcion;

    @Column(name = "tipoVehiculoEstado", nullable = false)
    private Integer tipoVehiculoEstado;

    @Column(name = "tipoModeloVehiculoCodigo", nullable = false)
    private Integer tipoModeloVehiculoCodigo;

}
