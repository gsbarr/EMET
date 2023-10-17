package com.emet.api.repositories;

import com.emet.api.models.Temp_Hum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Temp_HumRepository extends JpaRepository<Temp_Hum, Long> {
}
