package com.WebApp.WebApp.models;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "estadistica")
public class Estadistica {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "temperatura")
    private float temp;

    @Column(name = "humedad")
    private float hum;

    @Column(name = "presion_atmosferica")
    private float presion_at;

    @Column(name = "precipitaciones")
    private float precipitaciones;

    @Column(name = "intensidad_solar")
    private float int_solar;

    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaHora;
}
