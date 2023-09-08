package com.WebApp.WebApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "provincia")
public class ProvinciaEntity {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name ="provincia")
    private String provincia;

}
