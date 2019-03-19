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
@Table(name = "DelitosSexuales")
public class DelitosSexuales implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dsCodigoUnico", nullable = false)
    private Integer dsCodigoUnico;

    @Column(name = "dsCodigoParroquia", nullable = false)
    private Integer dsCodigoParroquia;

    @Column(name = "dsCodigoSecuencial", nullable = false, length = 10)
    private String dsCodigoSecuencial;

    @Column(name = "dsClaveExpediente", nullable = false, length = 10)
    private String dsClaveExpediente;

    @Column(name = "dsCodigoTipoPuntos", nullable = false)
    private Integer dsCodigoTipoPuntos;

    @Column(name = "dsCodigoFiscalia", nullable = false, length = 10)
    private String dsCodigoFiscalia;

    @Column(name = "dsCodigoFiscal", nullable = false)
    private Integer dsCodigoFiscal;

    @Column(name = "dsNumeroDenuncia", nullable = false, length = 10)
    private String dsNumeroDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "dsFechaDenuncia", nullable = false)
    private Date dsFechaDenuncia;

    @Column(name = "dsCodigoDia", nullable = false)
    private Integer dsCodigoDia;

    @Column(name = "dsCodigoMes", nullable = false)
    private Integer dsCodigoMes;

    @Column(name = "dsCodigoAnio", nullable = false)
    private Integer dsCodigoAnio;

    @Column(name = "dsHora", nullable = false)
    private Integer dsHora;

    @Column(name = "dsMinutos", nullable = false)
    private Integer dsMinutos;

    @Column(name = "dsCodigoLugar", nullable = false)
    private Integer dsCodigoLugar;

    @Column(name = "dsCodigoMecanismoAgresor", nullable = false)
    private Integer dsCodigoMecanismoAgresor;

    @Column(name = "dsCodObjetoAgresion", nullable = false)
    private Integer dsCodObjetoAgresion;

    @Column(name = "dsCodigoTipoDelito", nullable = false)
    private Integer dsCodigoTipoDelito;

    @Column(name = "dsCodigoTipoAgresion", nullable = false)
    private Integer dsCodigoTipoAgresion;

    @Column(name = "dsDelitoFlagrante", nullable = false)
    private Integer dsDelitoFlagrante;

    @Column(name = "dsVicDiscapacidadesDiferentes", nullable = false, length = 255)
    private String dsVicDiscapacidadesDiferentes;

    @Column(name = "dsCodigoAlcoholAgresor", nullable = false)
    private Integer dsCodigoAlcoholAgresor;

    @Column(name = "dsCodigoGradoAlcoholAgresor", nullable = false)
    private Integer dsCodigoGradoAlcoholAgresor;

    @Column(name = "dsObservaciones", nullable = false, length = 255)
    private String dsObservaciones;

    @Temporal(TemporalType.DATE)
    @Column(name = "dsFechaActualizacion", nullable = false)
    private Date dsFechaActualizacion;

    @Column(name = "dsGeoReferencia", nullable = false)
    private Integer dsGeoReferencia;

    @Column(name = "dsCodContinuidadCaso", nullable = false)
    private Integer dsCodContinuidadCaso;

    @Column(name = "dsCodigoGeo", nullable = false)
    private Integer dsCodigoGeo;

    @Column(name = "dsEstado", nullable = false)
    private Integer dsEstado;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoAlcoholAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AlcoholAgresor alcoholAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoGeo", referencedColumnName = "geoRefCodigo", insertable = false, updatable = false)
    private DatosGeoReferenciacion datosGeoReferenciacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodContinuidadCaso", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private DsContinuidadCaso dsContinuidadCaso;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoFiscal", referencedColumnName = "fiscalCodigo", insertable = false, updatable = false)
    private Fiscal fiscal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoFiscalia", referencedColumnName = "fiscaliaCodigo", insertable = false, updatable = false)
    private Fiscalia fiscalia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoGradoAlcoholAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private GradoAlcoholAgresor gradoAlcoholAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoLugar", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Lugar lugar;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoMecanismoAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private MecanismoAgresor mecanismoAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodObjetoAgresion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ObjetoAgresion objetoAgresion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoTipoAgresion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoAgresion tipoAgresion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoTipoDelito", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoDelito tipoDelito;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dsCodigoTipoPuntos", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoPunto tipoPunto;



    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "DelitoSexualAgresor",
            joinColumns = {@JoinColumn(name = "Codigo", referencedColumnName = "dsCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoAgresor", referencedColumnName = "Codigo")}
    )
    Set<Agresor> agresorList;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "DelitoSexualVictima",
            joinColumns = {@JoinColumn(name = "Codigo", referencedColumnName = "dsCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoVictima", referencedColumnName = "victimaCodigo")}
    )
    Set<Victima> victimaList;

}
