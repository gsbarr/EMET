package com.emet.api.statistics;

import com.emet.api.Locations.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    List<Statistics> findByLocacionAndFechaBetween(Location loc, Date start, Date end);
    Statistics findFirstByOrderByFechaDesc();
}
