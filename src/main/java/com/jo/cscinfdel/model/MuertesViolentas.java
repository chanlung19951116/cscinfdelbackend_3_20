package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "MuertesViolentas")
public class MuertesViolentas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mvCodigoUnico", nullable = false)
    private Integer mvCodigoUnico;

    @Column(name = "mvSecuencial", nullable = false)
    private Integer mvSecuencial;

    @Column(name = "mvCodigoParroquia", nullable = false)
    private Integer mvCodigoParroquia;

    @Column(name = "mvCodigoFiscalia", nullable = false, length = 10)
    private String mvCodigoFiscalia;

    @Column(name = "mvCodigoFiscal", nullable = false)
    private Integer mvCodigoFiscal;

    @Column(name = "mvNumeroExpedienteFiscalia", nullable = false, length = 10)
    private String mvNumeroExpedienteFiscalia;

    @Temporal(TemporalType.DATE)
    @Column(name = "mvFechaDenuncia", nullable = false)
    private Date mvFechaDenuncia;

    @Column(name = "mvNumeroExpediente", nullable = false, length = 10)
    private String mvNumeroExpediente;

    @Column(name = "mvCodigoTipoMuerte", nullable = false)
    private Integer mvCodigoTipoMuerte;

    @Column(name = "mvCodigoVictima", nullable = false)
    private Integer mvCodigoVictima;

    @Temporal(TemporalType.DATE)
    @Column(name = "mvFechaLevantamiento", nullable = false)
    private Date mvFechaLevantamiento;

    @Column(name = "mvHoraLevantamiento", nullable = false, length = 10)
    private String mvHoraLevantamiento;

    @Column(name = "mvCodLugarLevantamiento", nullable = false)
    private Integer mvCodLugarLevantamiento;

    @Column(name = "mvFehaHecho", nullable = false, length = 10)
    private String mvFehaHecho;

    @Column(name = "mvCodigoDia", nullable = false)
    private Integer mvCodigoDia;

    @Column(name = "mvCodigoMes", nullable = false)
    private Integer mvCodigoMes;

    @Column(name = "mvCodigoAnio", nullable = false)
    private Integer mvCodigoAnio;

    @Column(name = "mvHora", nullable = false)
    private Integer mvHora;

    @Column(name = "mvMinutos", nullable = false)
    private Integer mvMinutos;

    @Column(name = "mvDireccion", nullable = false, length = 255)
    private String mvDireccion;

    @Column(name = "mvCodigoArmMedioSuceso", nullable = false)
    private Integer mvCodigoArmMedioSuceso;

    @Column(name = "mvCodigoMotivoMuerte", nullable = false)
    private Integer mvCodigoMotivoMuerte;

    @Column(name = "mvCodigoAlcohol", nullable = false)
    private Integer mvCodigoAlcohol;

    @Column(name = "mvHistorialClinico", nullable = false, length = 255)
    private String mvHistorialClinico;

    @Column(name = "mvCodigoLugarTranslado", nullable = false)
    private Integer mvCodigoLugarTranslado;

    @Column(name = "mvCodigoMedico", nullable = false)
    private Integer mvCodigoMedico;

    @Column(name = "mvDisect", nullable = false, length = 255)
    private String mvDisect;

    @Column(name = "mvDelitoFlagrante", nullable = false)
    private Integer mvDelitoFlagrante;

    @Column(name = "mvObservaciones", nullable = false, length = 255)
    private String mvObservaciones;

    @Temporal(TemporalType.DATE)
    @Column(name = "mvFechaActualizacion", nullable = false)
    private Date mvFechaActualizacion;

    @Column(name = "mvCodigoDigitadorActual", nullable = false, length = 10)
    private String mvCodigoDigitadorActual;

    @Column(name = "mvArchivo", nullable = false, length = 30)
    private String mvArchivo;

    @Column(name = "mvArchivo2", nullable = false, length = 30)
    private String mvArchivo2;

    @Column(name = "mvTipoVehiculoVictima", nullable = false, length = 10)
    private String mvTipoVehiculoVictima;

    @Column(name = "mvVictimaConduce", nullable = false)
    private Integer mvVictimaConduce;

    @Column(name = "mvMuerteViolentaPol", nullable = false, length = 255)
    private String mvMuerteViolentaPol;

    @Column(name = "mvCodigoRestosVictimas", nullable = false)
    private Integer mvCodigoRestosVictimas;

    @Column(name = "mvCodigoGeo", nullable = false)
    private Integer mvCodigoGeo;

    @Column(name = "mvEstado", nullable = false)
    private Integer mvEstado;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoArmMedioSuceso", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ArmMedioSuceso armMedioSuceso;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoGeo", referencedColumnName = "geoRefCodigo", insertable = false, updatable = false)
    private DatosGeoReferenciacion datosGeoReferenciacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoFiscal", referencedColumnName = "fiscalCodigo", insertable = false, updatable = false)
    private Fiscal fiscal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoFiscalia", referencedColumnName = "fiscaliaCodigo", insertable = false, updatable = false)
    private Fiscalia fiscalia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodLugarLevantamiento", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private LugarLevantamiento lugarLevantamiento;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoLugarTranslado", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private LugarTraslado lugarTraslado;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoMedico", referencedColumnName = "medicoCodigo", insertable = false, updatable = false)
    private Medico medico;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoMotivoMuerte", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private MotivoMuerte motivoMuerte;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoParroquia", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Parroquia parroquia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoRestosVictimas", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private RestoVictima restoVictima;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoTipoMuerte", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoMuerte tipoMuerte;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoVictima", referencedColumnName = "victimaCodigo", insertable = false, updatable = false)
    private Victima victima;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mvCodigoAlcohol", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AlcoholVictima alcoholVictima;

}
