package com.WebApp.WebApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    // Columna obtenida por relación con otra tabla
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_domicilio")
    //private Domicilio domicilio;

    //public Domicilio getDomicilio() {
    //    return domicilio;
    //}

    //public void setDomicilio(Domicilio domicilio) {
    //    this.domicilio = domicilio;
    //}

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String dni) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
