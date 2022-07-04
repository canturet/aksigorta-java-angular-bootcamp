package org.egitim;

public class AesAlgorithm implements ICrypt { /* AES algoritmasına ait şifreleme işlemlerinin bulunduğu sınıf. */

	@Override
	public String encrypt(String text) {
		return "'" + text + "'" + " metni AES algoritması ile şifrelendi.";

	}

	@Override
	public String decrypt(String text) {
		return "'" + text + "'" + " metninin şifresi AES algoritması ile çözüldü.";
	}

}
