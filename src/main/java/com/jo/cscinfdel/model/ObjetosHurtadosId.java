package com.jo.cscinfdel.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class ObjetosHurtadosId implements Serializable {

    @Column(name = "ohCodigo", nullable = false)
    private Integer ohCodigo;

    @Column(name = "ohCodigoUnico", nullable = false)
    private Integer ohCodigoUnico;

}
