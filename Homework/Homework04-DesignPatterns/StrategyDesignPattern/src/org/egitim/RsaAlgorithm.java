package org.egitim;

public class RsaAlgorithm implements ICrypt { /* RSA algoritmasına ait şifreleme işlemlerinin bulunduğu sınıf. */

	@Override
	public String encrypt(String text) {
		return "'" + text + "'" + " metni RSA algoritması ile şifrelendi.";

	}

	@Override
	public String decrypt(String text) {
		return "'" + text + "'" + " metninin şifresi RSA algoritması ile çözüldü.";
	}

}
