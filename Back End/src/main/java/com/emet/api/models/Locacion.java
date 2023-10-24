package com.emet.api.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private Long id;

    @Getter @Setter
    @Column(name = "nombre")
    private String nombre;

    @Getter @Setter
    @Column(name = "coordenadas")
    private String coordenadas;

    @Getter @Setter
    @Column(name = "direccion")
    private String direccion;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference //Evita el json en bucle
    @JoinColumn(name = "fk_titular")
    private Titular titular;
}
