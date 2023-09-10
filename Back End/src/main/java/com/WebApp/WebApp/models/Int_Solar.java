package com.WebApp.WebApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Entity
@Table(name = "int_solar")
public class Int_Solar {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name = "lumenes")
    private float lumenes;

    @Getter @Setter
    @Column(name = "insolacion")
    private float insolacion;

    @Getter @Setter
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaHora;

    @Getter @Setter
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_locacion")
    private Locacion locacion;
}
