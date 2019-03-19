package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "LesionVictima")
public class LesionVictima implements Serializable {

    @EmbeddedId
    LesionVictimaId id;

    @MapsId("codigo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Codigo", referencedColumnName = "leCodigoUnico")
    private Lesiones lesiones;

    @MapsId("codigoVictima")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoVictima", referencedColumnName = "victimaCodigo")
    private Victima victima;

    @Column(name = "CodigoRangoLesion", nullable = false)
    private Integer codigoRangoLesion;

    @Column(name = "CodigoIndicioEstupefacientes", nullable = false)
    private Integer codigoIndicioEstupefacientes;

    @Column(name = "CodigoGradoAlcoholVictima", nullable = false)
    private Integer codigoGradoAlcoholVictima;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoRangoLesion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private RangoLesion rangoLesion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoIndicioEstupefacientes", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private IndicioEstupefacientes indicioEstupefacientes;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoGradoAlcoholVictima", referencedColumnName = "gradoAlcoholVictimaCodigo", insertable = false, updatable = false)
    private GradoAlcoholVictima gradoAlcoholVictima;

}
