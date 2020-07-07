package com.js.foodpoint.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="DESERTS")
@Getter
@Setter
public class Desert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="DESERT_ID")
    private Long biriyaniId;

    @Column(name = "NAME")
    private String cakeName;

    @Column(name= "TYPE")
    private String cakeType;

    @Column(name ="SERVINGS")
    private int servings;
}
