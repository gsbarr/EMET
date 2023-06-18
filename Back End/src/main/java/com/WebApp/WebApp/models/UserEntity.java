package com.WebApp.WebApp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
public class UserEntity {

    @Getter @Setter
    @Column(name = "id")
    @Id
    private int id;

    @Getter @Setter
    @Column(name = "nombre")
    private String nombre;

    @Getter @Setter
    @Column(name = "dni")
    private String dni;

    @Getter @Setter
    @Column(name = "password")
    private String password;

    /*
    El @Getter y @Setter hace lo mismo que este ejemplo:

    Getter:
    public String getNombre() {
        return nombre;
    }

    Setter:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    */
}
