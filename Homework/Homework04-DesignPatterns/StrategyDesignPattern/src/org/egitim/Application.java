package org.egitim;

public class Application {

	public static void main(String[] args) {

		Crypt cryptRSA = new Crypt(new RsaAlgorithm());
		System.out.println(cryptRSA.encrypt("Can"));
		System.out.println(cryptRSA.decrypt("Can"));

		Crypt cryptAES = new Crypt(new AesAlgorithm());
		System.out.println(cryptAES.encrypt("Türet"));
		System.out.println(cryptAES.decrypt("Türet"));

	}

}
