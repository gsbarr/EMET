package com.emet.api.statistics;

import com.emet.api.Locations.Location;
import com.emet.api.models.Pre_Atmosferica;
import com.emet.api.models.Precipitacion;
import com.emet.api.models.Temp_Hum;
import com.emet.api.repositories.Pre_AtmosfericaRepository;
import com.emet.api.repositories.PrecipitacionRepository;
import com.emet.api.repositories.Temp_HumRepository;
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
    private StatisticsRepository statisticsRepo;

    @Autowired
    private Temp_HumRepository tempHumRepository;
    @Autowired
    private PrecipitacionRepository precipitacionRepository;
    @Autowired
    private Pre_AtmosfericaRepository preAtmosfericaRepository;

    @Override
    public List<Statistics> getList(Map<String, String> fecha_semana) {

        Location loc = new Location();

        String[] fecha_inicio_str = fecha_semana.get("start_week").split("/");
        String[] fecha_final_str = fecha_semana.get("end_week").split("/");

        Date fecha_inicio = getDate(fecha_inicio_str);
        Date fecha_final = getDate(fecha_final_str);

        return statisticsRepo.findByLocacionAndFechaBetween(loc, fecha_inicio, fecha_final);
    }

    @Override
    public void promStatistics(String fecha_actual_str, Location loc) {

        Date fecha_actual = getDate(fecha_actual_str.split("/"));
        Date fecha_ayer = Date.valueOf(fecha_actual.toLocalDate().minusDays(1));


        List<Temp_Hum> temp_hum_list = tempHumRepository.findByLocacionAndFechaBetween(loc, fecha_ayer, fecha_actual);
        List<Precipitacion> preci_list = precipitacionRepository.findByLocacionAndFechaBetween(loc, fecha_ayer, fecha_actual);
        List<Pre_Atmosferica> pre_atmos_list = preAtmosfericaRepository.findByLocacionAndFechaBetween(loc, fecha_ayer, fecha_actual);

        float temp_suma = 0;
        float hum_suma = 0;
        float preci_suma = 0;
        float pre_atmos_suma = 0;

        for (Temp_Hum e : temp_hum_list) {
            temp_suma += e.getValorTemp();
            hum_suma += e.getValorHum();
        }
        for (Pre_Atmosferica e : pre_atmos_list) {
            pre_atmos_suma += e.getPresion();
        }
        for (Precipitacion e : preci_list) {
            preci_suma += e.getValorPrecipiMm();
        }
        float prom_temp = temp_suma / temp_hum_list.size();
        float prom_hum = hum_suma / temp_hum_list.size();
        float prom_pre_atmos = pre_atmos_suma / pre_atmos_list.size();
        float prom_preci = preci_suma / preci_list.size();

        Statistics stats = new Statistics();
        stats.setTemp(prom_temp);
        stats.setHum(prom_hum);
        stats.setPre_atmos(prom_pre_atmos);
        stats.setPrecipitacion(prom_preci);
        //stats.setInt_solar();
        stats.setLocacion(loc);
        stats.setFecha(fecha_actual);
    }

    private Date getDate(String[] fecha_semana) {
        int year = Integer.parseInt(fecha_semana[2]) - 1900; // Se le resta 1900 porque el tipo DATE se lo suma
        int month = Integer.parseInt(fecha_semana[1]) - 1; // Se le resta 1 porque en el tipo DATE los meses van de 0 a
                                                           // 11
        int day = Integer.parseInt(fecha_semana[0]);
        return new Date(year, month, day);
    }
}
