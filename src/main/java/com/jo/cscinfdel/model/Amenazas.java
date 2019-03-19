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
@Table(name = "Amenazas")
public class Amenazas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodigoUnico", nullable = false)
    private Integer CodigoUnico;

    @Column(name = "Secuencial", nullable = false, length = 10)
    private String secuencial;

    @Column(name = "ClaveExpediente", nullable = false, length = 10)
    private String claveExpediente;

    @Column(name = "CodigoTipoPunto", nullable = false)
    private Integer codigoTipoPunto;

    @Column(name = "CodigoResponsableEscaner", nullable = false)
    private Integer codigoResponsableEscaner;

    @Column(name = "CodigoFiscalia", nullable = false, length = 10)
    private String codigoFiscalia;

    @Column(name = "CodigoFiscal", nullable = false)
    private Integer codigoFiscal;

    @Column(name = "NumeroDenuncia", nullable = false, length = 10)
    private Integer numeroDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaDenuncia", nullable = false)
    private Date fechaDenuncia;

    @Column(name = "Direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "CodigoBarrio", nullable = false)
    private Integer codigoBarrio;

    @Column(name = "CodigoParroquia", nullable = false)
    private Integer codigoParroquia;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaHecho", nullable = false)
    private Date fechaHecho;

    @Column(name = "CodigoDia", nullable = false)
    private Integer codigoDia;

    @Column(name = "CodigoMes", nullable = false)
    private Integer codigoMes;

    @Column(name = "AnioHecho", nullable = false)
    private Integer anioHecho;

    @Column(name = "HoraHecho", nullable = false)
    private Integer horaHecho;

    @Column(name = "MinutoHecho", nullable = false)
    private Integer minutoHecho;

    @Column(name = "CodigoLugar", nullable = false)
    private Integer codigoLugar;

    @Column(name = "CodigoCausaAmenaza", nullable = false)
    private Integer codigoCausaAmenaza;

    @Column(name = "CodigoObjeto", nullable = false)
    private Integer codigoObjeto;

    @Column(name = "CodigoTipoAmenaza", nullable = false)
    private Integer codigoTipoAmenaza;

    @Column(name = "DelitoFlagrante", nullable = false)
    private Integer delitoFlagrante;

    @Column(name = "NumeroHombresAgresores", nullable = false)
    private Integer numeroHombresAgresores;

    @Column(name = "NumeroMujeresAgresores", nullable = false)
    private Integer numeroMujeresAgresores;

    @Column(name = "CodigoRelacionAgresor", nullable = false)
    private Integer codigoRelacionAgresor;

    @Column(name = "CodigoAlcoholAgresor", nullable = false)
    private Integer codigoAlcoholAgresor;

    @Column(name = "CodGradoAlcoholAgresor", nullable = false)
    private Integer codGradoAlcoholAgresor;


    @Column(name = "Observaciones", nullable = false, length = 255)
    private String observaciones;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaActualizacion", nullable = false)
    private Date fechaActualizacion;


    @Column(name = "GeoReferenciacion", nullable = false)
    private Integer geoReferenciacion;

    @Column(name = "Estado", nullable = false)
    private Integer estado;


    @Column(name = "GradoDiscapacidad", nullable = false, length = 10)
    private String gradoDiscapacidad;


    @Column(name = "CodigoGeo", nullable = false)
    private Integer codigoGeo;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodGradoAlcoholAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AmGradoAlcoholAgresor amGradoAlcoholAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoAlcoholAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AmAlcoholAgresor amAlcoholAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoCausaAmenaza", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AmCausaAmenaza amCausaAmenaza;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoTipoAmenaza", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AmTipoAmenaza amTipoAmenaza;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoBarrio", referencedColumnName = "barrioCodigo", insertable = false, updatable = false)
    private Barrio Barrio;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoCausaAmenaza", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private CausaAmenaza causaAmenaza;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoGeo", referencedColumnName = "geoRefCodigo", insertable = false, updatable = false)
    private DatosGeoReferenciacion datosGeoReferenciacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoFiscal", referencedColumnName = "fiscalCodigo", insertable = false, updatable = false)
    private Fiscal fiscal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoFiscalia", referencedColumnName = "fiscaliaCodigo", insertable = false, updatable = false)
    private Fiscalia fiscalia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoLugar", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Lugar lugar;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoParroquia", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia parroquia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoTipoAmenaza", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoAmenaza tipoAmenaza;





    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "AmenazaAgresores",
            joinColumns = {@JoinColumn(name = "Codigo", referencedColumnName = "CodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoAgresor", referencedColumnName = "Codigo")}
    )
    Set<Agresor> agresorList;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "AmenazaVictima",
            joinColumns = {@JoinColumn(name = "Codigo", referencedColumnName = "CodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoVictima", referencedColumnName = "victimaCodigo")}
    )
    Set<Victima> victimaList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "AmObjetoAgresion",
            joinColumns = {@JoinColumn(name = "AmObejtoAmenazaCodigo", referencedColumnName = "CodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "AmObejtoAmenazaAgresion", referencedColumnName = "Codigo")}
    )
    Set<ObjetoAgresion> objetoAgresionList;

}
