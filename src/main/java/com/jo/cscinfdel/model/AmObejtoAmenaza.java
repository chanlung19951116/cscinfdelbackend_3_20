package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "AmObejtoAmenaza")
public class AmObejtoAmenaza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AmObejtoAmenazaCodigo", nullable = false)
    private Integer amObejtoAmenazaCodigo;

    @Column(name = "AmObejtoAmenazaUnico", nullable = false, length = 10)
    private String amObejtoAmenazaUnico;

    @Column(name = "AmObejtoAmenazaAgresion", nullable = false)
    private Integer amObejtoAmenazaAgresion;

}
