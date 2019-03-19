package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Victima")
public class Victima implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "victimaCodigo", nullable = false)
    private Integer victimaCodigo;


    @Column(name = "victimaIdentificacion", nullable = false, length = 10)
    private String victimaIdentificacion;

    @Column(name = "victimaNombres", nullable = false, length = 50)
    private String victimaNombres;

    @Column(name = "victimaApellidos", nullable = false, length = 50)
    private String victimaApellidos;

    @Column(name = "victimaDireccion", nullable = false, length = 255)
    private String victimaDireccion;

    @Column(name = "victimaTelefono", nullable = false, length = 15)
    private String victimaTelefono;

    @Column(name = "victimaCodigoSexo", nullable = false)
    private Integer victimaCodigoSexo;

    @Column(name = "victimaCodigoNacionalidad", nullable = false)
    private Integer victimaCodigoNacionalidad;

    @Column(name = "victimaCodigoEtnia", nullable = false)
    private Integer victimaCodigoEtnia;

    @Column(name = "victimaCodigoEstadoCivil", nullable = false)
    private Integer victimaCodigoEstadoCivil;

    @Column(name = "victimaCodigoTipoDiscapacidad", nullable = false)
    private Integer victimaCodigoTipoDiscapacidad;

    @Column(name = "victimaCodigoOcupacion", nullable = false)
    private Integer victimaCodigoOcupacion;

    @Column(name = "victimaEdad", nullable = false)
    private Integer victimaEdad;

    @Column(name = "victimaAdolecente", nullable = false)
    private Integer victimaAdolecente;

    @Column(name = "victimaCodigoTipoEmpresa", nullable = false)
    private Integer victimaCodigoTipoEmpresa;

    @Column(name = "victimaNombreCompleto", nullable = false, length = 100)
    private String victimaNombreCompleto;



    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "victimaCodigoSexo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Sexo sexo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "victimaCodigoNacionalidad", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Nacionalidad nacionalidad;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "victimaCodigoEtnia", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Etnia etnia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "victimaCodigoEstadoCivil", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private EstadoCivil estadoCivil;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "victimaCodigoTipoDiscapacidad", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private TipoDiscapacidad tipoDiscapacidad;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "victimaCodigoOcupacion", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private Ocupacion ocupacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "victimaCodigoTipoEmpresa", referencedColumnName = "tipoEmpresaCodigo", insertable = false, updatable = false)
    private TipoEmpresa tipoEmpresa;

}
