package com.js.foodpoint.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="BIRIYANI")
@Getter
@Setter
public class Biriyani {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="BIRIYANI_ID")
        private Long biriyaniId;

        @Column(name = "NAME")
        private String cakeName;

        @Column(name= "TYPE")
        private String cakeType;

        @Column(name ="SERVINGS")
        private int servings;
}
