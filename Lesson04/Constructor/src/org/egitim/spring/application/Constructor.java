package org.egitim.spring.application;

import org.egitim.spring.domain.Kisi;
import org.egitim.spring.domain.KisiController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constructor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		KisiController kisiController = context.getBean("kisiController", KisiController.class);
		System.out.println(kisiController.insertKisi(new Kisi()));
	}

}
