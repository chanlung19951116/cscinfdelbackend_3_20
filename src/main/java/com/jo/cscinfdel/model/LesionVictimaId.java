package com.jo.cscinfdel.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class LesionVictimaId implements Serializable {

    @Column(name = "Codigo", nullable = false)
    private Integer codigo;

    @Column(name = "CodigoVictima", nullable = false)
    private Integer codigoVictima;

}
