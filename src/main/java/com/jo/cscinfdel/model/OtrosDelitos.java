package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "OtrosDelitos")
public class OtrosDelitos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odCodigoUnico", nullable = false)
    private Integer odCodigoUnico;

    @Column(name = "odCodigoParroquia", nullable = false)
    private Integer odCodigoParroquia;

    @Temporal(TemporalType.DATE)
    @Column(name = "odFechaDenuncia", nullable = false)
    private Date odFechaDenuncia;

    @Column(name = "odCodigoSecuencial", nullable = false)
    private String odCodigoSecuencial;

    @Column(name = "odCodigoFiscalia", nullable = false, length = 10)
    private String odCodigoFiscalia;

    @Column(name = "odCodigoFiscal", nullable = false)
    private Integer odCodigoFiscal;

    @Column(name = "odNumeroDenuncia", nullable = false, length = 10)
    private String odNumeroDenuncia;

    @Column(name = "odNumeroExpediente", nullable = false, length = 10)
    private String odNumeroExpediente;

    @Temporal(TemporalType.DATE)
    @Column(name = "odFechaHecho", nullable = false)
    private Date odFechaHecho;

    @Column(name = "odCodigoDia", nullable = false)
    private Integer odCodigoDia;

    @Column(name = "odCodigoMes", nullable = false)
    private Integer odCodigoMes;

    @Column(name = "odCodigoAnio", nullable = false)
    private Integer odCodigoAnio;

    @Column(name = "odCodigoVictima", nullable = false)
    private Integer odCodigoVictima;

    @Column(name = "odTipoCaso", nullable = false, length = 10)
    private String odTipoCaso;

    @Column(name = "odDireccionIncidente", nullable = false, length = 255)
    private String odDireccionIncidente;

    @Column(name = "odObservaciones", nullable = false, length = 255)
    private String odObservaciones;

    @Column(name = "odCodigoDigitadorActual", nullable = false)
    private Integer odCodigoDigitadorActual;

    @Temporal(TemporalType.DATE)
    @Column(name = "odFechaActualizacion", nullable = false)
    private Date odFechaActualizacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "odFechaIngreso", nullable = false)
    private Date odFechaIngreso;

    @Column(name = "odGeoReferenciacion", nullable = false)
    private Integer odGeoReferenciacion;

    @Column(name = "odCodigoGeo", nullable = false)
    private Integer odCodigoGeo;

    @Column(name = "odEstado", nullable = false)
    private Integer odEstado;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "odCodigoVictima", referencedColumnName = "victimaCodigo", insertable = false, updatable = false)
    private Victima victima;
}
