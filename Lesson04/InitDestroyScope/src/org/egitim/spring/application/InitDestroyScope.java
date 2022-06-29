package org.egitim.spring.application;

import org.egitim.spring.domain.DbManager;
import org.egitim.spring.domain.Kisi;
import org.egitim.spring.domain.KisiController;
import org.egitim.spring.domain.TransactionManager;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyScope {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		KisiController kisiController = context.getBean("kisiController", KisiController.class);
		System.out.println(kisiController.insertKisi(new Kisi()));
		System.out.println("KisiController 1 : " + kisiController);
		KisiController kisiController2 = context.getBean("kisiController", KisiController.class);
		System.out.println("KisiController 2 : " + kisiController2);

		System.out.println("**********");
		DbManager dbManager = context.getBean("dbManagerBean", DbManager.class);
		System.out.println("DB Manager : " + dbManager);
		System.out.println("Transaction Manager (DB Manager) : " + dbManager.getTransactionManager());

		/* TransactionManager Not Available In Spring Context */
		TransactionManager transactionManager = context.getBean("transactionManager", TransactionManager.class);
		System.out.println("Transaction Manager : " + transactionManager);

		context.registerShutdownHook();
	}

}
