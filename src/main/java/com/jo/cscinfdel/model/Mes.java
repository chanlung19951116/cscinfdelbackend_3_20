package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.jdo.annotations.PrimaryKey;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Mes")
public class Mes implements Serializable {

    @Id
    @Column(name = "mesCodigo", nullable = false)
    private Integer mesCodigo;

    @Column(name = "mesDescripcion", nullable = false, length = 50)
    private String mesDescripcion;

}
