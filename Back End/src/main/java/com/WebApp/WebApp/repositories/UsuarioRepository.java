package com.WebApp.WebApp.repositories;

import com.WebApp.WebApp.models.UsuarioEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntidad, Integer> {

}
