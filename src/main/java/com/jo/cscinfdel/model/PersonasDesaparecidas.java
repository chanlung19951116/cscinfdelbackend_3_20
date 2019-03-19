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
@Table(name = "PersonasDesaparecidas")
public class PersonasDesaparecidas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pdCodigoUnico", nullable = false)
    private Integer pdCodigoUnico;



    @Column(name = "pdCodigoParroquia", nullable = false)
    private Integer pdCodigoParroquia;

    @Column(name = "pdNumeroSecuencial", nullable = false, length = 10)
    private String pdNumeroSecuencial;

    @Column(name = "pdNumeroActoAdministrativo", nullable = false, length = 10)
    private String pdNumeroActoAdministrativo;

    @Column(name = "pdRespnsableScanner", nullable = false)
    private Integer pdRespnsableScanner;

    @Column(name = "pdCodigoFiscalia", nullable = false, length = 10)
    private String pdCodigoFiscalia;

    @Column(name = "pdCodigoFiscal", nullable = false)
    private Integer pdCodigoFiscal;

    @Column(name = "pdNumeroDenuncia", nullable = false, length = 10)
    private String pdNumeroDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "pdFechaDenuncia", nullable = false)
    private Date pdFechaDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "pdFechaDesaparicion", nullable = false)
    private Date pdFechaDesaparicion;

    @Column(name = "pdParroquiaDesaparicion", nullable = false)
    private Integer pdParroquiaDesaparicion;

    @Column(name = "pdCodigoDia", nullable = false)
    private Integer pdCodigoDia;

    @Column(name = "pdCodigoMes", nullable = false)
    private Integer pdCodigoMes;

    @Column(name = "pdCodigoAnio", nullable = false)
    private Integer pdCodigoAnio;

    @Column(name = "pdHora", nullable = false)
    private Integer pdHora;

    @Column(name = "pdMinutos", nullable = false)
    private Integer pdMinutos;

    @Column(name = "pdNumerosDesaparecidos", nullable = false)
    private Integer pdNumerosDesaparecidos;

    @Column(name = "pdPersonaDenuncia", nullable = false, length = 100)
    private String pdPersonaDenuncia;

    @Column(name = "pdCodigoLugarLocalizado", nullable = false)
    private Integer pdCodigoLugarLocalizado;

    @Temporal(TemporalType.DATE)
    @Column(name = "pdFechaLocalizado", nullable = false)
    private Date pdFechaLocalizado;

    @Column(name = "pdCodigoMotivoDesaparicion", nullable = false)
    private Integer pdCodigoMotivoDesaparicion;


    @Column(name = "pdCondicionEncontrado", nullable = false, length = 255)
    private String pdCondicionEncontrado;


    @Temporal(TemporalType.DATE)
    @Column(name = "pdFechaIngreso", nullable = false)
    private Date pdFechaIngreso;

    @Column(name = "pdObervacion", nullable = false, length = 255)
    private String pdObervacion;

    @Column(name = "pdGeoreferencia", nullable = false)
    private Integer pdGeoreferencia;

    @Column(name = "pdCodigoGeo", nullable = false)
    private Integer pdCodigoGeo;

    @Column(name = "pdPorcentajeDiscapacidad", nullable = false, length = 10)
    private String pdPorcentajeDiscapacidad;

    @Column(name = "pdLocalizado", nullable = false)
    private Integer pdLocalizado;

    @Column(name = "pdEstado", nullable = false)
    private Integer pdEstado;

    @Column(name = "pdCodigoAgresor", nullable = false)
    private Integer pdCodigoAgresor;

    @Column(name = "pdCodigoTipoPunto", nullable = false)
    private Integer pdCodigoTipoPunto;

    @Column(name = "pdCondicionRegresa", nullable = false)
    private Integer pdCondicionRegresa;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "DesaparecidoVictima",
            joinColumns = {@JoinColumn(name = "Codigo", referencedColumnName = "pdCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoVictima", referencedColumnName = "victimaCodigo")}
    )
    Set<Victima> victimaList;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pdCodigoAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Agresor agresor;



}
