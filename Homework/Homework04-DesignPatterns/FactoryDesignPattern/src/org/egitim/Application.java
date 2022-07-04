package org.egitim;

public class Application {

	public static void main(String[] args) {

		ILaptop msi = LaptopFactory.getLaptop("msi"); /* LaptopFactory sınıfındaki getLaptop fonksiyonunu kullanarak, MSI sınıfından nesne oluşturuyorum. */
		msi.create();

		ILaptop asus = LaptopFactory.getLaptop("asus"); /* LaptopFactory sınıfındaki getLaptop fonksiyonunu kullanarak, Asus sınıfından nesne oluşturuyorum. */
		asus.create();

	}

}
