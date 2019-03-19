package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "GradoAlcoholVictima")
public class GradoAlcoholVictima implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gradoAlcoholVictimaCodigo", nullable = false)
    private Integer gradoAlcoholVictimaCodigo;

    @Column(name = "gradoAlcoholVictimaDescripcion", nullable = false, length = 255)
    private String gradoAlcoholVictimaDescripcion;

    @Column(name = "gradoAlcoholVictimaEstado", nullable = false)
    private Integer gradoAlcoholVictimaEstado;

    @Column(name = "CodigoAlcoholVictima", nullable = false)
    private Integer codigoAlcoholVictima;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CodigoAlcoholVictima", referencedColumnName = "Codigo", insertable = false, updatable = false)
    private AlcoholVictima alcoholVictima;

}
