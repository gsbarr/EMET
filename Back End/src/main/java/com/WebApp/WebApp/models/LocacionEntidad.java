package com.WebApp.WebApp.models;


import jakarta.persistence.*;

@Entity
@Table(name = "locacion")
public class LocacionEntidad {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "coordenadas")
    private float coordenadas;

    @Column(name = "direccion")
    private String direccion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_titular")
    private TitularEntidad titular;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(float coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TitularEntidad getTitular() {
        return titular;
    }

    public void setTitular(TitularEntidad titular) {
        this.titular = titular;
    }
}
