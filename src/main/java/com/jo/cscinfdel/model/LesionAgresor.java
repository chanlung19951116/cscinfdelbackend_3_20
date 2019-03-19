package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "LesionAgresor")
public class LesionAgresor implements Serializable {

    @EmbeddedId
    LesionAgresorId id;

    @MapsId("codigo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Codigo", referencedColumnName = "leCodigoUnico")
    private Lesiones lesiones;

    @MapsId("codigoAgresor")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoAgresor", referencedColumnName = "Codigo")
    private Agresor agresor;

    @Column(name = "CodigoRelacionAgresor", nullable = false)
    private Integer codigoRelacionAgresor;

    @Column(name = "CodigoIndicioEstupefaciente", nullable = false)
    private Integer codigoIndicioEstupefaciente;

    @Column(name = "CodigoGradoAlcoholAgresor", nullable = false)
    private Integer codigoGradoAlcoholAgresor;

    @Column(name = "CodigoObjetoAgresion", nullable = false)
    private Integer codigoObjetoAgresion;

    @Column(name = "CodigoTipoAgresion", nullable = false)
    private Integer codigoTipoAgresion;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoRelacionAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private RelacionAgresor relacionAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoIndicioEstupefaciente", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private IndicioEstupefacientes indicioEstupefacientes;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoGradoAlcoholAgresor", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private GradoAlcoholAgresor gradoAlcoholAgresor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoObjetoAgresion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private ObjetoAgresion objetoAgresion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoTipoAgresion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoAgresion tipoAgresion;


}
