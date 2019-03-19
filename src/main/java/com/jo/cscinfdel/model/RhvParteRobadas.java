package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "RhvParteRobadas")
public class RhvParteRobadas {

    @EmbeddedId
    private RhvParteRobadasId id;

    @MapsId("rvCodigoUnico")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoUnico", referencedColumnName = "rvCodigoUnico")
    private RobosVehiculos robosVehiculos;

    @MapsId("codigoParteRobada")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoParteRobada", referencedColumnName = "Codigo")
    private ParteRobadaVehiculo parteRobadaVehiculo;

    @Column(name = "Cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "Valor", nullable = false)
    private Integer valor;

    @Column(name = "Recuperada", nullable = false)
    private Integer recuperada;
}
