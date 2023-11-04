package com.emet.api.Locations;


import com.emet.api.Titular.Titular;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "locacion")
public class Location {

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

    @Getter @Setter
    @OneToMany(mappedBy = "locacion")
    @JsonManagedReference
    private List<Estadistica> estadisticas;
}
