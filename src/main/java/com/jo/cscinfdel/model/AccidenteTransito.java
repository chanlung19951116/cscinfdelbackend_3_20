package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "AccidenteTransito")
public class AccidenteTransito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoRegistro", nullable = false)
    private Integer codigoRegistro;

    @Column(name = "secuencial", nullable = false, length = 10)
    private String secuencial;

    @Column(name = "claveFicha", nullable = false, length = 10)
    private String claveFicha;

    @Column(name = "codigoTipoPunto", nullable = false)
    private Integer codigoTipoPunto;

    @Column(name = "codigoFiscalia", nullable = false, length = 10)
    private String codigoFiscalia;

    @Column(name = "codigoFiscal", nullable = false)
    private Integer codigoFiscal;

    @Column(name = "numeroDenuncia", nullable = false, length = 10)
    private String numeroDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaDenuncia", nullable = false, length = 10)
    private Date fechaDenuncia;

    @Column(name = "direccionHecho", nullable = false, length = 255)
    private String direccionHecho;

    @Column(name = "codigoBarrio", nullable = false)
    private Integer codigoBarrio;

    @Column(name = "codigoParroquia", nullable = false)
    private Integer codigoParroquia;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaHecho", nullable = false, length = 10)
    private Date fechaHecho;

    @Column(name = "codigoDia", nullable = false)
    private Integer codigoDia;

    @Column(name = "codigoMes", nullable = false)
    private Integer codigoMes;

    @Column(name = "anioHecho", nullable = false)
    private Integer anioHecho;

    @Column(name = "horaHecho", nullable = false)
    private Integer horaHecho;

    @Column(name = "minutoHecho", nullable = false)
    private Integer minutoHecho;

    @Column(name = "codigoProcedenciaParte", nullable = false)
    private Integer codigoProcedenciaParte;

    @Column(name = "codigoLugar", nullable = false)
    private Integer codigoLugar;

    @Column(name = "codigoMomentoAccidente", nullable = false)
    private Integer codigoMomentoAccidente;

    @Column(name = "codigoTipoVia", nullable = false)
    private Integer codigoTipoVia;

    @Column(name = "codigoCondicionCalzada", nullable = false)
    private Integer codigoCondicionCalzada;

    @Column(name = "codigoClaseAccidente", nullable = false)
    private Integer codigoClaseAccidente;

    @Column(name = "codigoCausaAccidente", nullable = false)
    private Integer codigoCausaAccidente;

    @Column(name = "delitoFragante", nullable = false)
    private Integer delitoFragante;

    @Column(name = "codigoVictima", nullable = false)
    private Integer codigoVictima;

    @Column(name = "placaVehiculoVictima", nullable = false, length = 255)
    private String placaVehiculoVictima;

    @Column(name = "codigoAlcoholVictima", nullable = false)
    private Integer codigoAlcoholVictima;

    @Column(name = "codigoGradoAlcoholVictima", nullable = false)
    private Integer codigoGradoAlcoholVictima;

    @Column(name = "numHombresVehiculoVictima", nullable = false)
    private Integer numHombresVehiculoVictima;

    @Column(name = "numMujeresVehiculoVictima", nullable = false)
    private Integer numMujeresVehiculoVictima;

    @Column(name = "placaVehiculoAgresor", nullable = false, length = 255)
    private String placaVehiculoAgresor;

    @Column(name = "numHombresVehiculoAgresor", nullable = false)
    private Integer numHombresVehiculoAgresor;

    @Column(name = "numMujeresVehiculoAgresor", nullable = false)
    private Integer numMujeresVehiculoAgresor;

    @Column(name = "codigoAgresor", nullable = false)
    private Integer codigoAgresor;

    @Column(name = "codigoAlcoholAgresor", nullable = false)
    private Integer codigoAlcoholAgresor;

    @Column(name = "codGradoAlcoholAgresor", nullable = false)
    private Integer codGradoAlcoholAgresor;

    @Column(name = "observacion", nullable = false, length = 255)
    private String observacion;

    @Column(name = "numPersonaVehiculoVictima", nullable = false)
    private Integer numPersonaVehiculoVictima;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaActual", nullable = false, length = 10)
    private Date fechaActual;

    @Column(name = "georeferenciacion", nullable = false)
    private Integer georeferenciacion;

    @Column(name = "codigoGeo", nullable = false)
    private Integer codigoGeo;

    @Column(name = "estado", nullable = false)
    private Integer estado;



    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codGradoAlcoholAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private GradoAlcoholAgresor gradoAlcoholAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Agresor agresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoAlcoholAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AlcoholAgresor alcoholAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoCausaAccidente", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private CausaAccidente causaAccidente;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoCondicionCalzada", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private CondicionCalzada condicionCalzada;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoGeo", referencedColumnName = "geoRefCodigo", insertable = false, updatable = false)
    private DatosGeoReferenciacion datosGeoReferenciacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoFiscal", referencedColumnName = "fiscalCodigo", insertable = false, updatable = false)
    private Fiscal fiscal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoFiscalia", referencedColumnName = "fiscaliaCodigo", insertable = false, updatable = false)
    private Fiscalia fiscalia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoLugar", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Lugar lugar;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoMomentoAccidente", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private MomentoAccidente momentoAccidente;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoProcedenciaParte", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ProcedenciaParte procedenciaParte;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoTipoPunto", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoPunto tipoPunto;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoTipoVia", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoVia tipoVia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoVictima", referencedColumnName = "victimaCodigo", insertable = false, updatable = false)
    private Victima victima;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "placaVehiculoAgresor", referencedColumnName = "Placa", insertable = false, updatable = false)
    private Vehiculo vehiculo4PlacaVehiculoAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "placaVehiculoVictima", referencedColumnName = "Placa", insertable = false, updatable = false)
    private Vehiculo vehiculo4PlacaVehiculoVictima;


}
