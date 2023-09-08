package com.WebApp.WebApp.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "titular")
public class TitularEntity {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name = "nombre")
    private String nombre;

    @Getter @Setter
    @Column(name = "apellido")
    private String apellido;

    @Getter @Setter
    @Column(name = "razon_social")
    private String razonSocial;

    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private DomicilioEntity domicilio;

    @Getter @Setter
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_locacion")
    private List<LocacionEntity> locaciones;
}
