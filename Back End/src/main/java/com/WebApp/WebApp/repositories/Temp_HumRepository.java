package com.WebApp.WebApp.repositories;

import com.WebApp.WebApp.models.Temp_Hum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Temp_HumRepository extends JpaRepository<Temp_Hum, Long> {
}
