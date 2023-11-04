package com.emet.api.statistics;

import com.emet.api.Locations.Location;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "estadisticas")
public class Statistics {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column
    private Float temp;

    @Getter
    @Setter
    @Column
    private Float hum;

    @Getter
    @Setter
    @Column
    private Float pre_atmos;

    @Getter
    @Setter
    @Column
    private Float precipitacion;

    @Getter
    @Setter
    @Column
    private Float int_solar;

    @Getter
    @Setter
    @Column(name = "fecha")
    private Date fecha;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "fk_locacion")
    private Location locacion;
}
