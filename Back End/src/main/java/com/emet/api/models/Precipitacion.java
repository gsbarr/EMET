package com.emet.api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import com.emet.api.Locations.Location;

@Entity
@Table(name = "precipitacion")
public class Precipitacion {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "valor_precipi_mm")
    private Float valorPrecipiMm;

    @Getter @Setter
    @Column(name = "fecha_hora")
    private Date fechaHora;

    @Getter @Setter
    @ManyToOne(optional = true)
    @JoinColumn(name = "fk_locacion")
    private Location locacion;
}
