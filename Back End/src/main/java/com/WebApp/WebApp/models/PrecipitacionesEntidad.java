package com.WebApp.WebApp.models;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "precipitacion")
public class PrecipitacionesEntidad {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "valor_precipi_mm")
    private float valorPrecipiMm;

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

    public float getValorPrecipiMm() {
        return valorPrecipiMm;
    }

    public void setValorPrecipiMm(float valorPrecipiMm) {
        this.valorPrecipiMm = valorPrecipiMm;
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
