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
public class MenuRolId implements Serializable {

    @Column(name = "menucodigo", nullable = false)
    private Integer menucodigo;

    @Column(name = "rolcodigo", nullable = false)
    private Integer rolcodigo;

}

