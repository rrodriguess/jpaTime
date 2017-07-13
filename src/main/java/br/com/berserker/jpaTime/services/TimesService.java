package br.com.berserker.jpaTime.services;

import br.com.berserker.jpaTime.entities.Times;
import br.com.berserker.jpaTime.repositories.TimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@Service
public class TimesService {

    @Autowired
    private TimesRepository timesRepository;

    public TimesService(TimesRepository timesRepository) {
        this.timesRepository = timesRepository;
    }

    public void saveTime() {

        Times times = new Times();
        LocalDate nascimento = LocalDate.of(1983, Month.APRIL, 29);
        times.setNascimento(nascimento);

        LocalDateTime registro = LocalDateTime.now();
        times.setRegistroHora(registro);

        LocalTime interval = LocalTime.of(9, 10, 10);
        times.setIntervalo(interval);

        timesRepository.save(times);
    }
}
