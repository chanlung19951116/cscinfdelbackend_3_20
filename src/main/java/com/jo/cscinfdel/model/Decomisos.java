package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Decomisos")
public class Decomisos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dcCodigoUnico", nullable = false)
    private Integer dcCodigoUnico;

    @Column(name = "dcActaRetiro", nullable = false, length = 10)
    private String dcActaRetiro;

    @Column(name = "dcCodigoVendedor", nullable = false, length = 10)
    private Integer dcCodigoVendedor;

    @Column(name = "dcDireccionInfraccion", nullable = false, length = 255)
    private String dcDireccionInfraccion;

    @Temporal(TemporalType.DATE)
    @Column(name = "dcFechaInfraccion", nullable = false)
    private Date  dcFechaInfraccion;

    @Column(name = "dcHora", nullable = false)
    private Integer dcHora;

    @Column(name = "dcMinutos", nullable = false)
    private Integer dcMinutos;

    @Column(name = "dcCodigoTipoProcedimiento", nullable = false)
    private Integer dcCodigoTipoProcedimiento;

    @Column(name = "dcPoseeCarnetMunicipal", nullable = false)
    private Integer dcPoseeCarnetMunicipal;

    @Column(name = "dcImpugnacion", nullable = false)
    private Integer dcImpugnacion;

    @Column(name = "dcProductoEnDonacion", nullable = false)
    private Integer dcProductoEnDonacion;

    @Column(name = "dcCodigoLugarDonacion", nullable = false)
    private Integer dcCodigoLugarDonacion;

    @Column(name = "dcCodigoParroquia", nullable = false)
    private Integer dcCodigoParroquia;

    @Temporal(TemporalType.DATE)
    @Column(name = "dcFechaIngreso", nullable = false)
    private Date dcFechaIngreso;

    @Column(name = "dcGeoReferenciacion", nullable = false)
    private Integer dcGeoReferenciacion;

    @Column(name = "dcCodigoGeo", nullable = false)
    private Integer dcCodigoGeo;

    @Column(name = "dcEstado", nullable = false)
    private Integer dcEstado;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dcCodigoTipoProcedimiento", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoProcedimiento tipoProcedimiento;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dcCodigoVendedor", referencedColumnName = "codigoVendedor", insertable = false, updatable = false)
    private Vendedor vendedor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dcCodigoParroquia", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia parroquia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dcCodigoGeo", referencedColumnName = "geoRefCodigo", insertable = false, updatable = false)
    private DatosGeoReferenciacion datosGeoReferenciacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dcCodigoLugarDonacion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private LugarDonacion lugarDonacion;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "decomisos")
    private Set<ProductosDecomisados> productosDecomisadosList;


}
