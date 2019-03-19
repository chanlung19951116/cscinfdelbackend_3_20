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
@Table(name = "MicroTraficoDroga")
public class MicroTraficoDroga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mtCodigoUnico", nullable = false)
    private Integer mtCodigoUnico;

    @Column(name = "mtSecuencial", nullable = false, length = 10)
    private String mtSecuencial;

    @Column(name = "mtCodigoParroquia", nullable = false)
    private Integer mtCodigoParroquia;

    @Column(name = "mtClaveFicha", nullable = false, length = 10)
    private String mtClaveFicha;

    @Column(name = "mtCodigoFiscalia", nullable = false, length = 10)
    private String mtCodigoFiscalia;

    @Column(name = "mtCodigoFiscal", nullable = false)
    private Integer mtCodigoFiscal;

    @Column(name = "mtNumeroDenuncia", nullable = false, length = 10)
    private String mtNumeroDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "mtFechaDenuncia", nullable = false)
    private Date mtFechaDenuncia;

    @Column(name = "mtDireccionMicrotrafico", nullable = false, length = 255)
    private String mtDireccionMicrotrafico;

    @Temporal(TemporalType.DATE)
    @Column(name = "mtFechaHecho", nullable = false)
    private Date mtFechaHecho;

    @Column(name = "mtCodigoDia", nullable = false)
    private Integer mtCodigoDia;

    @Column(name = "mtCodigoMes", nullable = false)
    private Integer mtCodigoMes;

    @Column(name = "mtCodigoAnio", nullable = false)
    private Integer mtCodigoAnio;

    @Column(name = "mtHoraHecho", nullable = false)
    private Integer mtHoraHecho;

    @Column(name = "mtMinutosHechos", nullable = false)
    private Integer mtMinutosHechos;

    @Column(name = "mtCodigoTipoDelito", nullable = false)
    private Integer mtCodigoTipoDelito;

    @Column(name = "mtCodigoLugarDelito", nullable = false)
    private Integer mtCodigoLugarDelito;

    @Column(name = "mtCodigoTipoProcedimiento", nullable = false)
    private Integer mtCodigoTipoProcedimiento;

    @Column(name = "mtDelitoFlagrante", nullable = false)
    private Integer mtDelitoFlagrante;

    @Column(name = "mtEvidenciaEncontrada", nullable = false)
    private Integer mtEvidenciaEncontrada;

    @Column(name = "mtNumeroHombresDetenidos", nullable = false)
    private Integer mtNumeroHombresDetenidos;

    @Column(name = "mtNumeroMujeresDetenidas", nullable = false)
    private Integer mtNumeroMujeresDetenidas;

    @Temporal(TemporalType.DATE)
    @Column(name = "mtFechaDigitado", nullable = false)
    private Date mtFechaDigitado;

    @Column(name = "mtObservaciones", nullable = false, length = 255)
    private String mtObservaciones;

    @Column(name = "mtGeoReferenciacion", nullable = false)
    private Integer mtGeoReferenciacion;

    @Column(name = "mtEstado", nullable = false)
    private Integer mtEstado;

    @Column(name = "mtCodigoGeo", nullable = false)
    private Integer mtCodigoGeo;

    @Column(name = "mtCodigoQuienComDelito", nullable = false)
    private Integer mtCodigoQuienComDelito;

    @Column(name = "mtCodigoTipoPunto", nullable = false)
    private Integer mtCodigoTipoPunto;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoGeo", referencedColumnName = "geoRefCodigo", insertable = false, updatable = false)
    private DatosGeoReferenciacion DatosGeoReferenciacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoFiscal", referencedColumnName = "fiscalCodigo", insertable = false, updatable = false)
    private Fiscal Fiscal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoFiscalia", referencedColumnName = "fiscaliaCodigo", insertable = false, updatable = false)
    private Fiscalia Fiscalia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoLugarDelito", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Lugar Lugar;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoParroquia", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia Parroquia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoQuienComDelito", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private QuienCometeDelito QuienCometeDelito;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoTipoDelito", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoDelito TipoDelito;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoTipoProcedimiento", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoProcedimiento TipoProcedimiento;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mtCodigoTipoPunto", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoPunto TipoPunto;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "DrogaSustancia",
            joinColumns = {@JoinColumn(name = "dsCodigoUnico", referencedColumnName = "mtCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "dsCodigoSustanciaMicrotrafico", referencedColumnName = "smtCodigo")}
    )
    Set<SustanciaMicroTrafico> sustanciaMicroTraficoList;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "MicroTraficoDrogaEvidencia",
            joinColumns = {@JoinColumn(name = "mtCodigoUnico", referencedColumnName = "mtCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoEvidencia", referencedColumnName = "eeCodigo")}
    )
    Set<EvidenciaEncontrada> evidenciaEncontradaList;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "MicroTraficoDetenido",
            joinColumns = {@JoinColumn(name = "CodigoUnico", referencedColumnName = "mtCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoDetenido", referencedColumnName = "Codigo")}
    )
    Set<Agresor> agresorList;

}
