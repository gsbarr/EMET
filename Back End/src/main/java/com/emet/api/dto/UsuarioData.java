package com.emet.api.dto;

import lombok.Getter;
import lombok.Setter;

public class UsuarioData {

    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String password;
}
