package com.emet.api.repositories;

import com.emet.api.models.Pre_Atmosferica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pre_AtmosfericaRepository extends JpaRepository<Pre_Atmosferica, Long> {
}
