package br.com.berserker.jpaTime;

import br.com.berserker.jpaTime.services.TimesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaTimeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JpaTimeApplication.class, args);

		TimesService timesService = (TimesService) ctx.getBean("timesService");
		timesService.saveTime();
	}
}
