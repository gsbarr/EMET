package com.WebApp.WebApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
public class Domicilio {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name = "direccion")
    private String direccion;

    @Getter @Setter
    @ManyToOne(optional = false) //Indica que tiene que sí o sí tener una provincia
    @JoinColumn(name = "fk_provincia")
    private Provincia provincia;
}
