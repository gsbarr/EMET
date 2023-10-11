package com.emet.api.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "presion_atmosferica")
public class Pre_Atmosferica {

    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "fecha_hora")
    private Date fechaHora;

    @Getter @Setter
    @Column(name = "presion")
    private Float presion;

    @Getter @Setter
    @Column(name = "altitud")
    private Float altitud;

    @Getter @Setter
    @ManyToOne(optional = true)
    @JoinColumn(name = "fk_locacion")
    private Locacion locacion;

}
