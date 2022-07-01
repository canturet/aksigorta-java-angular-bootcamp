package org.spring.egitim.configuration;

import org.spring.egitim.domain.BirimController;
import org.spring.egitim.domain.PersonelController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfiguration {

	@Bean
	public BirimController getBirimController() {
		return new BirimController();
	}

	@Bean
	public PersonelController getPersonelController() {
		PersonelController personelController = new PersonelController();
		personelController.setEntityName("Personel");
		return personelController;
	}

}
