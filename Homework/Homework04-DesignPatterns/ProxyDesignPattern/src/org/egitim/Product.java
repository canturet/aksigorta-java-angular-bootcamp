package org.egitim;

import java.util.ArrayList;
import java.util.List;

public class Product implements IProduct {

	@Override
	public List<String> getProducts() {
		List<String> product = new ArrayList<String>();
		product.add("Telefon");
		product.add("Bilgisayar");
		return product;
	}

}
