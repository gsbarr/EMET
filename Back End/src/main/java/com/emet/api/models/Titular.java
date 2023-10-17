package com.emet.api.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "titular")
public class Titular {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "nombre")
    private String nombre;

    @Getter @Setter
    @Column(name = "apellido")
    private String apellido;

    @Getter @Setter
    @Column(name = "telefono")
    private String telefono;

    @Getter @Setter
    @Column(name = "razon_social")
    private String razonSocial;

    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @Getter @Setter
    @OneToMany(mappedBy = "titular") //Esta anotacion puede generar un mal rendimiento de la aplicacion
    @JsonManagedReference //Evita el json en bucle
    private List<Locacion> locaciones;

    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_usuario")
    @JsonIgnore
    private Usuario usuario;
}
