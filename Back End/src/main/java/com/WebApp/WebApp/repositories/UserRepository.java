package com.WebApp.WebApp.repositories;

import com.WebApp.WebApp.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Un repositorio permite hacer "querys" a una Base de Datos
@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {

}
