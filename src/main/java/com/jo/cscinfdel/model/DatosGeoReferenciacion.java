package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "DatosGeoReferenciacion")
public class DatosGeoReferenciacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "geoRefCodigo", nullable = false)
    private Integer geoRefCodigo;

    @Column(name = "geoRefCoordenadaX", nullable = false)
    private Integer geoRefCoordenadaX;

    @Column(name = "geoRefCoordenadaY", nullable = false)
    private Integer geoRefCoordenadaY;

    @Column(name = "parroquiaCodigo", nullable = false)
    private Integer parroquiaCodigo;

    @Column(name = "zonaCodigo", nullable = false)
    private Integer zonaCodigo;

    @Column(name = "circuitoCodigo", nullable = false)
    private Integer circuitoCodigo;

    @Column(name = "distritoCodigo", nullable = false)
    private Integer distritoCodigo;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parroquiaCodigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia parroquia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "zonaCodigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Zona zona;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "circuitoCodigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Circuito circuito;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "distritoCodigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Distrito distrito;


}

