package com.emet.api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "estadisticas")
public class Estadistica {

    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column
    private Float temp;

    @Getter @Setter
    @Column
    private Float hum;

    @Getter @Setter
    @Column
    private Float pre_atmos;

    @Getter @Setter
    @Column
    private Float precipitacion;

    @Getter @Setter
    @Column
    private Float int_solar;

    @Getter @Setter
    @Column(name = "fecha")
    private Date fecha;
}
