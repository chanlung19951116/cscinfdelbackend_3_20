package com.jo.cscinfdel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "MenuRol")
public class MenuRol implements Serializable {

    @EmbeddedId
    private MenuRolId id;

    @MapsId("menucodigo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menucodigo", referencedColumnName = "codigo")
    private Menu menu;

    @MapsId("rolcodigo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rolcodigo", referencedColumnName = "Codigo")
    private Rol rol;

    @Column(name = "ins", nullable = false)
    private Integer ins;

    @Column(name = "upd", nullable = false)
    private Integer upd;

    @Column(name = "del", nullable = false)
    private Integer del;

    @Column(name = "rea", nullable = false)
    private Integer rea;

}
