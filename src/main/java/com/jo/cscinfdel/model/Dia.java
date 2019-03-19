package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Dia")
public class Dia implements Serializable {

    @Id
    @Column(name = "codigoDia", nullable = false)
    private Integer codigoDia;

    @Column(name = "descripcionDia", nullable = false, length = 50)
    private String descripcionDia;

}
