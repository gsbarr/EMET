package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.UsuarioEntidad;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface UsuarioDao {

    UsuarioEntidad crearUsuario();
    UsuarioEntidad getUsuario(@PathVariable int id) ;

    List<UsuarioEntidad> getLista();

    void eliminar(int id);

    void registrar(Map<String, String> u);
}
