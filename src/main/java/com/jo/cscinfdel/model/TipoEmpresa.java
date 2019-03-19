package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "TipoEmpresa")
public class TipoEmpresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoEmpresaCodigo", nullable = false)
    private Integer tipoEmpresaCodigo;

    @Column(name = "tipoEmpresaDescripcion", nullable = false, length = 255)
    private String tipoEmpresaDescripcion;

}
