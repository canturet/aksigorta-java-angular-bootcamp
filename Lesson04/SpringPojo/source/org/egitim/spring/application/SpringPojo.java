package org.egitim.spring.application;

import org.egitim.spring.domain.Ogrenci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPojo {

	public static void main(String[] args) {

		Ogrenci ogrenciPojo = new Ogrenci();
		System.out.println("Öğrenci POJO : " + ogrenciPojo);
		System.out.println("Öğrenci Adı : " + ogrenciPojo.getAd());

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");
		System.out.println("Context : " + context);

		Ogrenci ogrenciBean = context.getBean("ogrenci", Ogrenci.class);
		System.out.println("Öğrenci Bean : " + ogrenciBean);
		System.out.println("Öğrenci Adı : " + ogrenciBean.getAd());

	}

}
