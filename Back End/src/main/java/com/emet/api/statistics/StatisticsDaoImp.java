package com.emet.api.statistics;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Transactional
@Repository
public class StatisticsDaoImp implements StatisticsDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private StatisticsRepository estadisticaRepo;

    @Override
    public List<Statistics> getList(Map<String, String> fecha_semana) {

        String[] fecha_inicio_str = fecha_semana.get("start_week").split("/");
        String[] fecha_final_str = fecha_semana.get("end_week").split("/");

        Date fecha_inicio = getDate(fecha_inicio_str);
        Date fecha_final = getDate(fecha_final_str);

        return estadisticaRepo.findByfechaBetween(fecha_inicio, fecha_final);
    }

    private Date getDate(String[] fecha_semana) {
        int year = Integer.parseInt(fecha_semana[2]) - 1900; // Se le resta 1900 porque el tipo DATE se lo suma
        int month = Integer.parseInt(fecha_semana[1]) - 1; // Se le resta 1 porque en el tipo DATE los meses van de 0 a
                                                           // 11
        int day = Integer.parseInt(fecha_semana[0]);
        return new Date(year, month, day);
    }
}
