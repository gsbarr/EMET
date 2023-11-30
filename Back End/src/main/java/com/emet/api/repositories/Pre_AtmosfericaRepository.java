package com.emet.api.repositories;

import com.emet.api.Locations.Location;
import com.emet.api.models.Pre_Atmosferica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Pre_AtmosfericaRepository extends JpaRepository<Pre_Atmosferica, Long> {

    List<Pre_Atmosferica> findByLocacionAndFechaBetween(Location loc, Date start, Date end);
}
