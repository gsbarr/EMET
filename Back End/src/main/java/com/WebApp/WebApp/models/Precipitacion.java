package com.WebApp.WebApp.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "precipitacion")
public class Precipitacion {

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
    private Date fechaHora;

    @Getter @Setter
    @ManyToOne(optional = true)
    @JoinColumn(name = "fk_locacion")
    private Locacion locacion;
}
