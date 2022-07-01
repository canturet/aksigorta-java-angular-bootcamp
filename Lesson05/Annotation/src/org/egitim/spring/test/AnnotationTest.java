package org.egitim.spring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.egitim.spring.configuration.AnnotationConfiguration;
import org.egitim.spring.domain.DatabaseOperator;
import org.egitim.spring.domain.DateUtility;
import org.egitim.spring.domain.KisiController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class AnnotationTest {

	@Test
	void test() {
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("context.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AnnotationConfiguration.class);
		System.out.println("Context : " + context);

		KisiController kisiController = context.getBean(KisiController.class);
		System.out.println("KisiController : " + kisiController);
		DatabaseOperator databaseOperator = context.getBean(DatabaseOperator.class);
		System.out.println("DatabaseOperator : " + databaseOperator);
		System.out.println("DatabaseOperator (KisiController) : " + kisiController.getDatabaseOperator());

		System.out.println("DateUtility (KisiController) :" + kisiController.getDateUtility());
		DateUtility dateUtility = context.getBean(DateUtility.class);
		System.out.println("DateUtility (Bean) : " + dateUtility);
	}

}
