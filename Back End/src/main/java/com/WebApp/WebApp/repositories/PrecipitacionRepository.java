package com.WebApp.WebApp.repositories;

import com.WebApp.WebApp.models.Precipitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecipitacionRepository extends JpaRepository<Precipitacion, Long> {
}
