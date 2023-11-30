package com.emet.api.repositories;

import com.emet.api.Locations.Location;
import com.emet.api.models.Temp_Hum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Temp_HumRepository extends JpaRepository<Temp_Hum, Long> {

    List<Temp_Hum> findByLocacionAndFechaBetween(Location loc, Date start, Date end);
}
