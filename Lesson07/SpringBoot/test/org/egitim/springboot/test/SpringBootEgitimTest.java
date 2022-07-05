package org.egitim.springboot.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.egitim.springboot.application.Application;
import org.egitim.springboot.data.entity.Kisi;
import org.egitim.springboot.service.KisiService;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { Application.class }, webEnvironment=SpringBootTest.WebEnvironment.DEFINED_PORT)
class SpringBootEgitimTest {

	private static final String BASE_URI = "http://localhost:8081/egitim/kisi";

	@BeforeAll
	public static void setup() {
		RestAssured.baseURI = BASE_URI;
	}

	@Test
	void testFindByTcKimlikNo() {
		Response response = RestAssured.get();
		assertEquals(HttpStatus.OK.value(), response.getStatusCode());
	}

}
