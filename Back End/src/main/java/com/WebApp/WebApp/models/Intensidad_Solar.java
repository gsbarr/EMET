package com.WebApp.WebApp.models;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "int_solar")
public class Intensidad_Solar {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "lumenes")
    private float lumenes;

    @Column(name = "insolacion")
    private float insolacion;

    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaHora;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_locacion")
    private Locacion locacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLumenes() {
        return lumenes;
    }

    public void setLumenes(float lumenes) {
        this.lumenes = lumenes;
    }

    public float getInsolacion() {
        return insolacion;
    }

    public void setInsolacion(float insolacion) {
        this.insolacion = insolacion;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Locacion getLocacion() {
        return locacion;
    }

    public void setLocacion(Locacion locacion) {
        this.locacion = locacion;
    }
}
