package com.WebApp.WebApp.models;


import jakarta.persistence.*;

@Entity
@Table(name = "titular")
public class TitularEntidad {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "razon_social")
    private String razonSocial;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private DomicilioEntidad domicilio;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_locacion")
    private LocacionEntidad locacion;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public DomicilioEntidad getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioEntidad domicilio) {
        this.domicilio = domicilio;
    }

    public LocacionEntidad getLocacion() {
        return locacion;
    }

    public void setLocacion(LocacionEntidad locacion) {
        this.locacion = locacion;
    }


}
