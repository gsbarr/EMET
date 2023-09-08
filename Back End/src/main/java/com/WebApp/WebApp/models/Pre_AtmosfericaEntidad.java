package com.WebApp.WebApp.models;


import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "presion_atmosferica")
public class Pre_AtmosfericaEntidad {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaHora;

    @Column(name = "altitud")
    private float altitud;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_locacion")
    private LocacionEntidad locacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public float getAltitud() {
        return altitud;
    }

    public void setAltitud(float altitud) {
        this.altitud = altitud;
    }

    public LocacionEntidad getLocacion() {
        return locacion;
    }

    public void setLocacion(LocacionEntidad locacion) {
        this.locacion = locacion;
    }

}
