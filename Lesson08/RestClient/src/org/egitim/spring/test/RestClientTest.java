package org.egitim.spring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.egitim.spring.client.RestClient;
import org.junit.jupiter.api.Test;

class RestClientTest {

	@Test
	void testServiceKisiTumListe() {
		RestClient restClient = new RestClient();
		restClient.serviceKisiTumListe();
	}

}
