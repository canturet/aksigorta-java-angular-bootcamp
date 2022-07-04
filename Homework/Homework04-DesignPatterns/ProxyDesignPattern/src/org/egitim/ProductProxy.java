package org.egitim;

import java.util.List;

public class ProductProxy implements IProduct {

	private Product product = null;

	@Override
	public List<String> getProducts() {
		product = new Product();
		return product.getProducts();
	}

}
