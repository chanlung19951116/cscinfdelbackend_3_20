package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Vehiculo")
public class Vehiculo implements Serializable {

    @Id
    @Column(name = "Placa", nullable = false, length = 8)
    private String placa;

    @Column(name = "CodigoMarca", nullable = false)
    private Integer codigoMarca;

    @Column(name = "CodigoModelo", nullable = false)
    private Integer codigoModelo;

    @Column(name = "CodigoTipoVehiculo", nullable = false)
    private Integer codigoTipoVehiculo;

    @Column(name = "CodigoTipoServicio", nullable = false)
    private Integer codigoTipoServicio;

    @Column(name = "Anio", nullable = false)
    private Integer anio;

    @Column(name = "CodigoColor", nullable = false)
    private Integer codigoColor;

    @Column(name = "CodigoTipoEmpresaVehiculo", nullable = false)
    private Integer codigoTipoEmpresaVehiculo;

    @Column(name = "Avaluo", nullable = false)
    private Float avaluo;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoColor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ColorVehiculo colorVehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoMarca", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private MarcaVehiculo marcaVehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoModelo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ModeloVehiculo modeloVehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoTipoServicio", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ServicioVehiculo servicioVehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoTipoEmpresaVehiculo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoEmpresaVehiculo tipoEmpresaVehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoTipoVehiculo", referencedColumnName = "tipoVehiculoCodigo", insertable = false, updatable = false)
    private TipoVehiculo tipoVehiculo;


}
