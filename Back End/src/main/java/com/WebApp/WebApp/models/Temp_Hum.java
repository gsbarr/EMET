package com.WebApp.WebApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "temp_hum")
public class Temp_Hum {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "valor_temp")
    private Float valorTemp;

    @Getter @Setter
    @Column(name = "valor_hum")
    private Float valorHum;

    @Getter @Setter
    @Column(name = "fecha_hora")
    private Date fechaHora;

    @Getter @Setter
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_locacion")
    private Locacion locacion;
}
