package com.WebApp.WebApp.repositories;

import com.WebApp.WebApp.models.Estadistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadisticaRepository extends JpaRepository<Estadistica, Integer> {
}
