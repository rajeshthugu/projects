package com.js.foodpoint.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="CAKES")
@Getter
@Setter
public class Cake {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CAKE_ID")
    private Long cakeId;

    @Column(name = "NAME")
    private String cakeName;

    @Column(name= "TYPE")
    private String cakeType;

    @Column(name ="SERVINGS")
    private int servings;
}
