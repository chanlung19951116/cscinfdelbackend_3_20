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
public class RhvParteRobadasId implements Serializable {

    @Column(name = "rvCodigoUnico", nullable = false)
    private Integer rvCodigoUnico;

    @Column(name = "codigoParteRobada", nullable = false)
    private Integer codigoParteRobada;

}
