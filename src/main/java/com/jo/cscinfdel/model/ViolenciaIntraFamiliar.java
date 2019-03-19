package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ViolenciaIntraFamiliar")
public class ViolenciaIntraFamiliar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "viCodigoUnico", nullable = false)
    private Integer viCodigoUnico;

    @Column(name = "viCodigoSecuencial", nullable = false, length = 10)
    private String viCodigoSecuencial;

    @Column(name = "viCodigoFiscalia", nullable = false, length = 10)
    private String viCodigoFiscalia;

    @Column(name = "viCodigoFiscal", nullable = false)
    private Integer viCodigoFiscal;

    @Column(name = "viNumeroDenuncia", nullable = false, length = 10)
    private String viNumeroDenuncia;

    @Column(name = "viClaveExpediente", nullable = false, length = 10)
    private String viClaveExpediente;

    @Column(name = "viCodigoTipoPunto", nullable = false)
    private Integer viCodigoTipoPunto;

    @Column(name = "viCodigoAdministrador", nullable = false)
    private Integer viCodigoAdministrador;

    @Temporal(TemporalType.DATE)
    @Column(name = "viFechaIngreso", nullable = false)
    private Date viFechaIngreso;

    @Column(name = "viCodigoTipoDenuncia", nullable = false)
    private Integer viCodigoTipoDenuncia;

    @Column(name = "viCodigoVictima", nullable = false)
    private Integer viCodigoVictima;

    @Column(name = "viConvivenciaAgresor", nullable = false)
    private Integer viConvivenciaAgresor;

    @Column(name = "viTiempoRelacionAgresor", nullable = false)
    private Integer viTiempoRelacionAgresor;

    @Column(name = "viNumeroHijos", nullable = false)
    private Integer viNumeroHijos;

    @Column(name = "viNumeroHijas", nullable = false)
    private Integer viNumeroHijas;

    @Column(name = "viTotalHijos", nullable = false)
    private Integer viTotalHijos;

    @Temporal(TemporalType.DATE)
    @Column(name = "viFechaAgresion", nullable = false)
    private Date viFechaAgresion;

    @Column(name = "viCodigoDia", nullable = false)
    private Integer viCodigoDia;

    @Column(name = "viCodigoMes", nullable = false)
    private Integer viCodigoMes;

    @Column(name = "viCodigoAnio", nullable = false)
    private Integer viCodigoAnio;

    @Column(name = "viHoraHecho", nullable = false)
    private Integer viHoraHecho;

    @Column(name = "viMinutosHecho", nullable = false)
    private Integer viMinutosHecho;

    @Column(name = "viDireccionAgresion", nullable = false, length = 255)
    private String viDireccionAgresion;

    @Column(name = "viCodigoParroquiaAgresion", nullable = false)
    private Integer viCodigoParroquiaAgresion;

    @Column(name = "viCodigoLugarAgresion", nullable = false)
    private Integer viCodigoLugarAgresion;

    @Column(name = "viCodigoFrecuenciaAgresion", nullable = false)
    private Integer viCodigoFrecuenciaAgresion;

    @Column(name = "viNumeroVecesDenunciado", nullable = false)
    private Integer viNumeroVecesDenunciado;

    @Column(name = "viAgresorMaltrataHijos", nullable = false)
    private Integer viAgresorMaltrataHijos;

    @Column(name = "viEstadoGestacionVictima", nullable = false)
    private Integer viEstadoGestacionVictima;

    @Column(name = "viDescadenanteMigracion", length = 10)
    private String viDescadenanteMigracion;

    @Column(name = "viHijosPresenciaronHecho", nullable = false)
    private Integer viHijosPresenciaronHecho;

    @Temporal(TemporalType.DATE)
    @Column(name = "viFechaActualizacion", nullable = false)
    private Date viFechaActualizacion;

    @Column(name = "viObservaciones", length = 255)
    private String viObservaciones;

    @Column(name = "viCodigoJudicatura", nullable = false, length = 10)
    private String viCodigoJudicatura;

    @Column(name = "viCodigoParroquia", nullable = false)
    private Integer viCodigoParroquia;

    @Column(name = "viCodigoBarrio", nullable = false)
    private Integer viCodigoBarrio;

    @Column(name = "viGeoReferenciacion", nullable = false)
    private Integer viGeoReferenciacion;

    @Column(name = "viCodigoGeo", nullable = false)
    private Integer viCodigoGeo;

    @Column(name = "viCodigoTipoDelito", nullable = false)
    private Integer viCodigoTipoDelito;

    @Column(name = "viEstado", nullable = false)
    private Integer viEstado;


    // =========================================


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoFiscalia", referencedColumnName = "fiscaliaCodigo", insertable = false, updatable = false)
    private Fiscalia fiscalia;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoFiscal", referencedColumnName = "fiscalCodigo", insertable = false, updatable = false)
    private Fiscal fiscal;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoTipoPunto", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoPunto tipoPunto;



    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoVictima", referencedColumnName = "victimaCodigo", insertable = false, updatable = false)
    private Victima victima;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoDia", referencedColumnName = "codigoDia", insertable = false, updatable = false)
    private Dia dia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoMes", referencedColumnName = "mesCodigo", insertable = false, updatable = false)
    private Mes mes;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoParroquiaAgresion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia parroquia4ViCodigoParroquiaAgresion;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoLugarAgresion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Lugar lugar;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoFrecuenciaAgresion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private FrecuenciaAgresor frecuenciaAgresor;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoParroquia", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia parroquia4ViCodigoParroquia;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoBarrio", referencedColumnName = "barrioCodigo", insertable = false, updatable = false)
    private Barrio barrio;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoGeo", referencedColumnName = "geoRefCodigo", insertable = false, updatable = false)
    private DatosGeoReferenciacion datosGeoReferenciacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "viCodigoTipoDelito", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoDelito tipoDelito;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "ViDescadenante",
            joinColumns = {@JoinColumn(name = "codigoUnico", referencedColumnName = "viCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "codigoDescadenante", referencedColumnName = "Codigo")}
    )
    Set<Descadenante> descadenanteList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "viObjetoAgresion",
            joinColumns = {@JoinColumn(name = "viCodigoUnico", referencedColumnName = "viCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoObjetoAgresion", referencedColumnName = "Codigo")}
    )
    Set<ObjetoAgresion> objetoAgresionList;



    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "viTipoAgresion",
            joinColumns = {@JoinColumn(name = "viCodigoUnico", referencedColumnName = "viCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoTipoAgresion", referencedColumnName = "Codigo")}
    )
    Set<TipoAgresion> tipoAgresionList;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "viAgresores",
            joinColumns = {@JoinColumn(name = "iCodigoUnico", referencedColumnName = "viCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoAgresor", referencedColumnName = "Codigo")}
    )
    Set<Agresor> agresorList;



}
