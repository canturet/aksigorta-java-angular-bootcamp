package org.egitim;

public class LaptopFactory {

	public static ILaptop getLaptop(String producer) { /* Kullanıcıdan gelen üretici bilgisine göre ilgili sınıftan nesne oluşturulmasını sağlıyorum. */

		ILaptop laptop;
		if (producer.equals("msi")) {
			laptop = new MSI();
		} else if (producer.equals("asus")) {
			laptop = new Asus();
		} else {
			throw new RuntimeException("Üretici geçersiz.");
		}
		return laptop;

	}

}
