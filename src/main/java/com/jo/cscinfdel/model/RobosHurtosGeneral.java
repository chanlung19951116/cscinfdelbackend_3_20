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
@Table(name = "RobosHurtosGeneral")
public class RobosHurtosGeneral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rhCodigoUnico", nullable = false)
    private Integer rhCodigoUnico;

    @Column(name = "rhCodigoParroquia", nullable = false)
    private Integer rhCodigoParroquia;

    @Temporal(TemporalType.DATE)
    @Column(name = "rhFechaDenuncia", nullable = false)
    private Date rhFechaDenuncia;

    @Column(name = "rhCodigoSecuencial", nullable = false, length = 10)
    private String rhCodigoSecuencial;

    @Column(name = "rhClaveExpediente", nullable = false, length = 10)
    private String rhClaveExpediente;

    @Column(name = "rhCodigoTipoPunto", nullable = false)
    private Integer rhCodigoTipoPunto;

    @Column(name = "rhCodigoResponsableScanner", nullable = false)
    private Integer rhCodigoResponsableScanner;

    @Column(name = "rhCodigoFiscalia", nullable = false, length = 10)
    private String rhCodigoFiscalia;

    @Column(name = "rhCodigoFiscal", nullable = false)
    private Integer rhCodigoFiscal;

    @Column(name = "rhNumeroDenuncia", nullable = false, length = 10)
    private String rhNumeroDenuncia;

    @Column(name = "rhDireccionDenuncia", nullable = false)
    private Integer rhDireccionDenuncia;

    @Temporal(TemporalType.DATE)
    @Column(name = "rhFechaHecho", nullable = false)
    private Date rhFechaHecho;

    @Column(name = "rhCodigoDia", nullable = false)
    private Integer rhCodigoDia;

    @Column(name = "rhCodigoMes", nullable = false)
    private Integer rhCodigoMes;

    @Column(name = "rhCodigoAnio", nullable = false)
    private Integer rhCodigoAnio;

    @Column(name = "rhHora", nullable = false)
    private Integer rhHora;

    @Column(name = "rhMinutos", nullable = false)
    private Integer rhMinutos;

    @Column(name = "rhHorarioHecho", nullable = false, length = 10)
    private String rhHorarioHecho;

    @Column(name = "rhCodigoTipoDelito", nullable = false)
    private Integer rhCodigoTipoDelito;

    @Column(name = "rhCodigoAfectados", nullable = false)
    private Integer rhCodigoAfectados;

    @Column(name = "rhCodigoLugar", nullable = false)
    private Integer rhCodigoLugar;

    @Column(name = "rhCodigoAutorDelito", nullable = false)
    private Integer rhCodigoAutorDelito;

    @Column(name = "rhCodigoModalidadDelito", nullable = false)
    private Integer rhCodigoModalidadDelito;

    @Column(name = "rhCodigoTipoAgresion", nullable = false)
    private Integer rhCodigoTipoAgresion;

    @Column(name = "rhCodigoObjetoAgresion", nullable = false)
    private Integer rhCodigoObjetoAgresion;

    @Column(name = "rhDelitoFlagrantes", nullable = false)
    private Integer rhDelitoFlagrantes;

    @Column(name = "rhNumeroAgresoresHombres", nullable = false)
    private Integer rhNumeroAgresoresHombres;

    @Column(name = "rhNumeroAgresoresMujeres", nullable = false)
    private Integer rhNumeroAgresoresMujeres;

    @Temporal(TemporalType.DATE)
    @Column(name = "rhFechaIngreso", nullable = false)
    private Date rhFechaIngreso;

    @Column(name = "rhObservaciones", nullable = false, length = 255)
    private String rhObservaciones;

    @Column(name = "rhCodigoDigitadorModifica", nullable = false)
    private Integer rhCodigoDigitadorModifica;

    @Temporal(TemporalType.DATE)
    @Column(name = "rhFechaModificacion", nullable = false)
    private Date rhFechaModificacion;

    @Column(name = "rhGeoReferenciacion", nullable = false)
    private Integer rhGeoReferenciacion;

    @Column(name = "rhCodigoGeo", nullable = false)
    private Integer rhCodigoGeo;

    @Column(name = "rhAvaluoTotal", nullable = false)
    private Integer rhAvaluoTotal;

    @Column(name = "rhEstado", nullable = false)
    private Integer rhEstado;









    @OneToMany(fetch = FetchType.EAGER, mappedBy = "robosHurtosGeneral")
    private Set<ObjetosHurtados> objetosHurtadosList;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "RhGAgresores",
            joinColumns = {@JoinColumn(name = "CodigoUnico", referencedColumnName = "rhCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoAgresor", referencedColumnName = "Codigo")}
    )
    Set<Agresor> agresorList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "RhGVictimas",
            joinColumns = {@JoinColumn(name = "CodigoUnico", referencedColumnName = "rhCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoVictima", referencedColumnName = "victimaCodigo")}
    )
    Set<Victima> victimaList;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "RHGObjetoAgresion",
            joinColumns = {@JoinColumn(name = "CodigoUnico", referencedColumnName = "rhCodigoUnico")},
            inverseJoinColumns = {@JoinColumn(name = "CodigoObjetoAgresion ", referencedColumnName = "Codigo")}
    )

    Set<ObjetoAgresion> objetoAgresionList;

}
