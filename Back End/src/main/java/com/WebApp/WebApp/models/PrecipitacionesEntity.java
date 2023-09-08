package com.WebApp.WebApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Entity
@Table(name = "precipitacion")
public class PrecipitacionesEntity {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name = "valor_precipi_mm")
    private float valorPrecipiMm;

    @Getter @Setter
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaHora;

    @Getter @Setter
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_locacion")
    private LocacionEntity locacion;
}
