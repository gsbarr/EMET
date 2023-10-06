package com.WebApp.WebApp.repositories;

import com.WebApp.WebApp.models.Pre_Atmosferica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pre_AtmosfericaRepository extends JpaRepository<Pre_Atmosferica, Long> {
}
