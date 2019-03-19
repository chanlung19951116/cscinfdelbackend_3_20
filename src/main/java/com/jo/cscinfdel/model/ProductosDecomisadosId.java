package com.jo.cscinfdel.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class ProductosDecomisadosId implements Serializable {

    @Column(name = "pdCodigoUnico", nullable = false)
    private Integer pdCodigoUnico;

    @Column(name = "productoDecomisadoCodigo", nullable = false)
    private Integer productoDecomisadoCodigo;


}
