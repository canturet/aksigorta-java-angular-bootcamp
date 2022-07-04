package org.egitim;

public class Application {

	public static void main(String[] args) {

		ProductProxy productProxy = new ProductProxy(); /* İşlemler vekil (ProductProxy) sınıfı üzerinden yapılıyor. */
		System.out.println(productProxy.getProducts());

	}

}
