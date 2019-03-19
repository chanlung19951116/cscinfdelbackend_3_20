package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "DrogaSustancia")
public class DrogaSustancia implements Serializable {

    @Id
    @Column(name = "smtCodigo", nullable = false)
    private Integer smtCodigo;

    @Column(name = "dsCodigoUnico", nullable = false, length = 10)
    private String dsCodigoUnico;

    @Column(name = "dsCodigoSustanciaMicrotrafico")
    private Integer dsCodigoSustanciaMicrotrafico;

}
