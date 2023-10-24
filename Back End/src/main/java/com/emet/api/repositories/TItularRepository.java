package com.emet.api.repositories;

import com.emet.api.models.Titular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TitularRepository extends JpaRepository<Titular, Long> {
}
