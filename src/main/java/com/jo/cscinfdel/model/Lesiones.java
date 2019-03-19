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
@Table(name = "lesiones")
public class Lesiones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leCodigoUnico", nullable = false)
    private Integer leCodigoUnico;

    @Column(name = "leCodigoSecuencial", nullable = false, length = 10)
    private String leCodigoSecuencial;

    @Column(name = "leClaveExpediente", nullable = false, length = 10)
    private String leClaveExpediente;

    @Column(name = "leCodigoTipoPunto", nullable = false)
    private Integer leCodigoTipoPunto;

    @Column(name = "leCodigoRespScanner", nullable = false)
    private Integer leCodigoRespScanner;

    @Column(name = "leCodigoFiscalia", nullable = false, length = 10)
    private String leCodigoFiscalia;

    @Column(name = "leCodigoFiscal", nullable = false)
    private Integer leCodigoFiscal;

    @Column(name = "leNumeroDenuncia", nullable = false, length = 10)
    private String leNumeroDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "leFechaDenuncia", nullable = false)
    private Date leFechaDenuncia;

    @Column(name = "leDireccionDenuncia", nullable = false, length = 100)
    private String leDireccionDenuncia;

    @Column(name = "leCodigoParroquia", nullable = false)
    private Integer leCodigoParroquia;

    @Column(name = "leCodigoBarrio", nullable = false)
    private Integer leCodigoBarrio;

    @Column(name = "leCodigoTipoRinia", nullable = false)
    private Integer leCodigoTipoRinia;

    @Column(name = "leCodigoGrupoFocal", nullable = false)
    private Integer leCodigoGrupoFocal;

    @Column(name = "leCodigoMecanismoAgresor", nullable = false)
    private Integer leCodigoMecanismoAgresor;

    @Temporal(TemporalType.DATE)
    @Column(name = "leFechaHecho", nullable = false)
    private Date leFechaHecho;

    @Column(name = "leCodigoDia", nullable = false)
    private Integer leCodigoDia;

    @Column(name = "leCodigoMes", nullable = false)
    private Integer leCodigoMes;

    @Column(name = "leCodigoAnio", nullable = false)
    private Integer leCodigoAnio;

    @Column(name = "leHora", nullable = false)
    private Integer leHora;

    @Column(name = "leMinutos", nullable = false)
    private Integer leMinutos;

    @Column(name = "leCodigoLugar", nullable = false)
    private Integer leCodigoLugar;

    @Column(name = "leDelitoFlagrante", nullable = false)
    private Integer leDelitoFlagrante;

    @Column(name = "leNumeroHombres", nullable = false)
    private Integer leNumeroHombres;

    @Column(name = "leNumeroMujeres", nullable = false)
    private Integer leNumeroMujeres;

    @Column(name = "leObservaciones", nullable = false, length = 255)
    private String leObservaciones;

    @Temporal(TemporalType.DATE)
    @Column(name = "leFechaActualizacion", nullable = false)
    private Date leFechaActualizacion;

    @Column(name = "leGeoReferenciacion", nullable = false)
    private Integer leGeoReferenciacion;

    @Column(name = "leCodigoGeo", nullable = false)
    private Integer leCodigoGeo;

    @Column(name = "leEstado", nullable = false)
    private Integer leEstado;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "lesiones")
    private Set<LesionAgresor> lesionAgresorList;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "lesiones")
    private Set<LesionVictima> lesionVictimaList;


}
