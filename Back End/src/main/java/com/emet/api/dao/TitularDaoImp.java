package com.emet.api.dao;

import com.emet.api.models.Titular;
import com.emet.api.repositories.TItularRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Transactional
@Repository
public class TitularDaoImp implements TitularDao{

    @Autowired
    private TItularRepository titularRepo;

    @Override
    public Titular getTitularById(Long id) {
        Optional<Titular> optionalTitular = titularRepo.findById(id);
        return optionalTitular.orElse(null);
    }
}
