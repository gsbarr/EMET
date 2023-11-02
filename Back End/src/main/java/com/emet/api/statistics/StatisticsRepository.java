package com.emet.api.statistics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    List<Statistics> findByfechaBetween(Date start, Date end);
}
