package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.querydsl.binding.QuerydslPredicate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Libadores")
@QuerydslPredicate
public class Libadores implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lbCodigoUnico", nullable = false)
    private Integer lbCodigoUnico;

    @Column(name = "lbCodigoLibador", nullable = false)
    private Integer lbCodigoLibador;

    @Column(name = "lbExpediente", nullable = false, length = 10)
    private String lbExpediente;

    @Column(name = "lbDireccionInfraccion", nullable = false, length = 100)
    private String lbDireccionInfraccion;

    @Temporal(TemporalType.DATE)
    @Column(name = "lbFechaInfraccion", nullable = false)
    private Date lbFechaInfraccion;

    @Column(name = "lbHoraInfraccion", nullable = false)
    private Integer lbHoraInfraccion;

    @Column(name = "lbMinutoInfraccion", nullable = false)
    private Integer lbMinutoInfraccion;

    @Column(name = "lbNumeroCitacion", nullable = false, length = 10)
    private String lbNumeroCitacion;

    @Column(name = "lbParteInformativo", nullable = false, length = 255)
    private String lbParteInformativo;

    @Column(name = "lbTipoBebida", nullable = false, length = 50)
    private String lbTipoBebida;

    @Column(name = "lbCodigoTipoProcedimiento", nullable = false)
    private Integer lbCodigoTipoProcedimiento;

    @Temporal(TemporalType.DATE)
    @Column(name = "lbFechaIngreso", nullable = false)
    private Date lbFechaIngreso;

    @Column(name = "lbCodigoParroquia", nullable = false)
    private Integer lbCodigoParroquia;

    @Column(name = "lbCodigoTipoResolucion", nullable = false)
    private Integer lbCodigoTipoResolucion;

    @Column(name = "lbGeoReferenciacion", nullable = false)
    private Integer lbGeoReferenciacion;

    @Column(name = "lbCodigoGeo", nullable = false)
    private Integer lbCodigoGeo;

    @Column(name = "lbImpugna", nullable = false)
    private Integer lbImpugna;

    @Column(name = "lbEstado", nullable = false)
    private Integer lbEstado;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lbCodigoLibador", referencedColumnName="lbCodigoLibador", insertable = false, updatable = false)
    private Libador libador;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lbCodigoTipoProcedimiento", referencedColumnName="Codigo", insertable = false, updatable = false)
    private TipoProcedimiento tipoProcedimiento;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lbCodigoTipoResolucion", referencedColumnName="Codigo", insertable = false, updatable = false)
    private TipoResolucion tipoResolucion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lbCodigoParroquia", referencedColumnName="Codigo", insertable = false, updatable = false)
    private Parroquia parroquia;

}
