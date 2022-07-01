package org.spring.egitim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.spring.egitim.configuration.DomainConfiguration;
import org.spring.egitim.configuration.SystemConfiguration;
import org.spring.egitim.domain.BirimController;
import org.spring.egitim.domain.PersonelController;
import org.spring.egitim.system.SecurityController;
import org.spring.egitim.system.SystemConstants;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ConfigurationTest {

	@Test
	void test() {

		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(DomainConfiguration.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(DomainConfiguration.class);
		context.register(SystemConfiguration.class);
		context.refresh();
		System.out.println("Context : " + context);

		BirimController birimController = context.getBean(BirimController.class);
		System.out.println("Birim Controller : " + birimController);
		System.out.println("Birim Controller : " + birimController.getEntityName());

		PersonelController personelController = context.getBean(PersonelController.class);
		System.out.println("Personel Controller : " + personelController);
		System.out.println("Personel Entity Name : " + personelController.getEntityName());

		SystemConstants systemConstants = context.getBean(SystemConstants.class);
		System.out.println("Maksimum Kullanıcı Sayısı :" + systemConstants.MAX_USER);

		SecurityController securityController = context.getBean(SecurityController.class);
		System.out.println("Security Controller : " + securityController);
		System.out.println("User Validator (Security Controller) : " + securityController.getUserValidator());

	}

}
