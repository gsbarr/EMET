package com.WebApp.WebApp.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locacion")
public class Locacion {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name = "nombre")
    private String nombre;

    @Getter @Setter
    @Column(name = "coordenadas")
    private float coordenadas;

    @Getter @Setter
    @Column(name = "direccion")
    private String direccion;

    @Getter @Setter
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_titular")
    private Titular titular;
}
