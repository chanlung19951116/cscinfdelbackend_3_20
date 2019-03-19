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
@Table(name = "RobosVehiculos")
public class RobosVehiculos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rvCodigoUnico", nullable = false)
    private Integer rvCodigoUnico;


    @Column(name = "rvCodigoParroquia", nullable = false)
    private Integer rvCodigoParroquia;

    @Column(name = "rvCodigoSecuencial", nullable = false, length = 10)
    private String rvCodigoSecuencial;

    @Column(name = "rvNumeroExpediente", nullable = false, length = 10)
    private String rvNumeroExpediente;

    @Column(name = "rvCodigoTipoPunto", nullable = false)
    private Integer rvCodigoTipoPunto;

    @Column(name = "rvCodigoResponsableScanner", nullable = false)
    private Integer rvCodigoResponsableScanner;

    @Column(name = "rvCodigoFiscalia", nullable = false, length = 10)
    private String rvCodigoFiscalia;

    @Column(name = "rvCodigoFiscal", nullable = false)
    private Integer rvCodigoFiscal;

    @Column(name = "rvNumeroDenuncia", nullable = false, length = 10)
    private String rvNumeroDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "rvFechaDenuncia", nullable = false)
    private Date rvFechaDenuncia;

    @Column(name = "rvTipoDelito", nullable = false)
    private Integer rvTipoDelito;

    @Column(name = "rvDireccionHecho", nullable = false, length = 255)
    private String rvDireccionHecho;

    @Temporal(TemporalType.DATE)
    @Column(name = "rvFechaHecho", nullable = false)
    private Date rvFechaHecho;

    @Column(name = "rvCodigoDia", nullable = false)
    private Integer rvCodigoDia;

    @Column(name = "rvCodigoMes", nullable = false)
    private Integer rvCodigoMes;

    @Column(name = "rvCodigoAnio", nullable = false)
    private Integer rvCodigoAnio;

    @Column(name = "rvAnioHecho", nullable = false)
    private Integer rvAnioHecho;

    @Column(name = "rvHoraHecho", nullable = false)
    private Integer rvHoraHecho;

    @Column(name = "rvMinutoHecho", nullable = false)
    private Integer rvMinutoHecho;

    @Column(name = "rvCodigoLugar", nullable = false)
    private Integer rvCodigoLugar;

    @Column(name = "rvCodigoAutorDelito", nullable = false)
    private Integer rvCodigoAutorDelito;

    @Column(name = "rvCodigoVictimasDelito", nullable = false)
    private Integer rvCodigoVictimasDelito;

    @Column(name = "rvCodigoTipoAgresion", nullable = false)
    private Integer rvCodigoTipoAgresion;

    @Column(name = "rvCircunstanciasVehiculo", nullable = false, length = 255)
    private String rvCircunstanciasVehiculo;

    @Column(name = "rvCodigoModalidadRobo", nullable = false)
    private Integer rvCodigoModalidadRobo;

    @Column(name = "rvDelitoFlagrante", nullable = false)
    private Integer rvDelitoFlagrante;

    @Column(name = "rvPlacaVehiculoVictima", nullable = false, length = 8)
    private String rvPlacaVehiculoVictima;

    @Column(name = "rvCodigoObjetoRobadoVh", nullable = false)
    private Integer rvCodigoObjetoRobadoVh;

    @Column(name = "rvNumeroHombresAgresor", nullable = false)
    private Integer rvNumeroHombresAgresor;

    @Column(name = "rvNumeroMujeresAgresor", nullable = false)
    private Integer rvNumeroMujeresAgresor;

    @Column(name = "rvVehiculoRecuperado", nullable = false)
    private Integer rvVehiculoRecuperado;

    @Column(name = "rvObservaciones", nullable = false, length = 255)
    private String rvObservaciones;

    @Column(name = "rvCodigoDigitadorActualiza", nullable = false)
    private Integer rvCodigoDigitadorActualiza;

    @Temporal(TemporalType.DATE)
    @Column(name = "rvFechaActualizacion", nullable = false)
    private Date rvFechaActualizacion;

    @Column(name = "rvGeoReferenciacion", nullable = false)
    private Integer rvGeoReferenciacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "rvFechaValidacion", nullable = false)
    private Date rvFechaValidacion;

    @Column(name = "rvNombreValidacion", nullable = false, length = 50)
    private String rvNombreValidacion;

    @Column(name = "rvCodigoGeo", nullable = false)
    private Integer rvCodigoGeo;

    @Column(name = "rvEstado", nullable = false)
    private Integer rvEstado;

    @Column(name = "rvPartesRobadas", nullable = false)
    private Integer rvPartesRobadas;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoAutorDelito", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AutorDelito autorDelito;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoFiscal", referencedColumnName = "fiscalCodigo", insertable = false, updatable = false)
    private Fiscal fiscal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoFiscalia", referencedColumnName = "fiscaliaCodigo", insertable = false, updatable = false)
    private Fiscalia fiscalia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoLugar", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Lugar lugar;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoModalidadRobo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ModalidadRobo modalidadRobo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoObjetoRobadoVh", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ObjetoRobadoVehiculo objetoRobadoVehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvPlacaVehiculoVictima", referencedColumnName = "Placa", insertable = false, updatable = false)
    private Vehiculo vehiculo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvTipoDelito", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoDelito tipoDelito;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rvCodigoVictimasDelito", referencedColumnName = "victimaCodigo", insertable = false, updatable = false)
    private Victima victima;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "RhvAgresores",
            joinColumns = {@JoinColumn(name = "rvCodigoUnico", referencedColumnName = "rvCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoAgresor", referencedColumnName = "Codigo")}
    )
    Set<Agresor> agresorList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "RhvObjetoAgresion",
            joinColumns = {@JoinColumn(name = "CodigoUnico", referencedColumnName = "rvCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoObjetoAgresion ", referencedColumnName = "Codigo")}
    )

    Set<ObjetoAgresion> objetoAgresionList;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "robosVehiculos")
    Set<RhvParteRobadas> rhvParteRobadasList;

}
