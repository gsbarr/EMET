package com.emet.api.repositories;

import com.emet.api.Locations.Location;
import com.emet.api.models.Precipitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PrecipitacionRepository extends JpaRepository<Precipitacion, Long> {

    List<Precipitacion> findByLocacionAndFechaBetween(Location loc, Date start, Date end);
}
