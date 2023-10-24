package com.emet.api.dao.Locacion;

import com.emet.api.dto.LocacionData;
import com.emet.api.models.Locacion;
import com.emet.api.models.Titular;
import com.emet.api.repositories.LocacionesRepository;
import com.emet.api.repositories.TitularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class LocacionDaoImp implements LocacionDao{

    @Autowired
    private TitularRepository titularRepo;
    @Autowired
    private LocacionesRepository locacionesRepository;
    @Override
    public void saveLocacion(LocacionData data) {
        Locacion newLocacion = new Locacion();
        Titular titular = titularRepo.findById(data.getTitular()).orElse(null);
        newLocacion.setNombre(data.getNombre());
        newLocacion.setCoordenadas(data.getCoordenadas());
        newLocacion.setDireccion(data.getDireccion());
        newLocacion.setTitular(titular);

        locacionesRepository.save(newLocacion);
    }

    @Override
    public Locacion getLocacionById(Long id) {
        return null;
    }
}
