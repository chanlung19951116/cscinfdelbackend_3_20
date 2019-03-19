package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Agresor")
public class Agresor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo", nullable = false)
    private Integer codigo;

    @Column(name = "Identificacion", nullable = false, length = 10)
    private String identificacion;

    @Column(name = "Nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name = "Apellidos", nullable = false, length = 50)
    private String apellidos;

    @Column(name = "Direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "Telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "CodigoSexo", nullable = false)
    private Integer codigoSexo;

    @Column(name = "CodigoNacionalidad", nullable = false)
    private Integer codigoNacionalidad;

    @Column(name = "CodigoEtnia", nullable = false)
    private Integer codigoEtnia;

    @Column(name = "CodigoEstadoCivil", nullable = false)
    private Integer codigoEstadoCivil;

    @Column(name = "CodigoTipoDiscapacidad", nullable = false)
    private Integer codigoTipoDiscapacidad;

    @Column(name = "CodigoOcupacion")
    private Integer codigoOcupacion;

    @Column(name = "Edad", nullable = false)
    private Integer edad;

    @Column(name = "Adolecente", nullable = false)
    private Integer adolecente;

    @Column(name = "CodigoRegion", nullable = false)
    private Integer codigoRegion;

    @Column(name = "CodigoRelacionAgresor", nullable = false)
    private Integer codigoRelacionAgresor;

    @Column(name = "NombreCompleto", nullable = false, length = 100)
    private String nombreCompleto;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoSexo", referencedColumnName="Codigo", insertable = false, updatable = false)
    private Sexo sexo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoNacionalidad", referencedColumnName="Codigo", insertable = false, updatable = false)
    private Nacionalidad nacionalidad;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoEtnia", referencedColumnName="Codigo", insertable = false, updatable = false)
    private Etnia etnia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoEstadoCivil", referencedColumnName="Codigo", insertable = false, updatable = false)
    private EstadoCivil estadoCivil;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoTipoDiscapacidad", referencedColumnName="Codigo", insertable = false, updatable = false)
    private TipoDiscapacidad tipoDiscapacidad;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoOcupacion", referencedColumnName="Codigo", insertable = false, updatable = false)
    private Ocupacion ocupacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoRegion", referencedColumnName="Codigo", insertable = false, updatable = false)
    private Region region;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoRelacionAgresor", referencedColumnName="Codigo", insertable = false, updatable = false)
    private RelacionAgresor relacionAgresor;

}
