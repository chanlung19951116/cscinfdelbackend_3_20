package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "ObjetosHurtados")
public class ObjetosHurtados implements Serializable {

    @EmbeddedId
    ObjetosHurtadosId id;

    @MapsId("ohCodigo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ohCodigo", referencedColumnName = "Codigo")
    private ObjetoHurtado objetoHurtado;

    @MapsId("ohCodigoUnico")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ohCodigoUnico", referencedColumnName = "rhCodigoUnico")
    private RobosHurtosGeneral robosHurtosGeneral;

    @Column(name = "ohObjetoRecuperado", nullable = false, length = 255)
    private String ohObjetoRecuperado;

}
