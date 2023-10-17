package com.emet.api.repositories;

import com.emet.api.models.Precipitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecipitacionRepository extends JpaRepository<Precipitacion, Long> {
}
