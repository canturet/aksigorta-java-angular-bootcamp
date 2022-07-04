package org.egitim;

public class Crypt {

	ICrypt crypt = null;

	public Crypt(ICrypt crypt) {
		this.crypt = crypt;
	}

	public String encrypt(String text) {
		return this.crypt.encrypt(text);
	};

	public String decrypt(String text) {
		return this.crypt.decrypt(text);
	};

}
