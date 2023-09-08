package com.WebApp.WebApp.models;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "temp_hum")
public class Temp_HumEntidad {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "valor_temp")
    private float valorTemp;

    @Column(name = "valor_hum")
    private float valorHum;

    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaHora;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_locacion")
    private LocacionEntidad locacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorTemp() {
        return valorTemp;
    }

    public void setValorTemp(float valorTemp) {
        this.valorTemp = valorTemp;
    }

    public float getValorHum() {
        return valorHum;
    }

    public void setValorHum(float valorHum) {
        this.valorHum = valorHum;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public LocacionEntidad getLocacion() {
        return locacion;
    }

    public void setLocacion(LocacionEntidad locacion) {
        this.locacion = locacion;
    }
}
