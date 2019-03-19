package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ProductosDecomisados")
public class ProductosDecomisados implements Serializable {

    @EmbeddedId
    private ProductosDecomisadosId id;

    @MapsId("pdCodigoUnico")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pdCodigoUnico", referencedColumnName = "dcCodigoUnico")
    private Decomisos decomisos;

    @MapsId("productoDecomisadoCodigo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productoDecomisadoCodigo", referencedColumnName = "Codigo")
    private ProductoDecomisado productoDecomisado;

    @Column(name = "pdCantidad", nullable = false)
    private Integer pdCantidad;

    @Column(name = "pdValor", nullable = false)
    private Float pdValor;

    @Column(name = "pdDadoDonacion", nullable = false)
    private Integer pdDadoDonacion;

}
