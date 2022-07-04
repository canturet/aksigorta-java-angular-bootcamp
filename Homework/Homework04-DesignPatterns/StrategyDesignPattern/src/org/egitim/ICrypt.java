package org.egitim;

public interface ICrypt { /* AesAlgorithm ve RsaAlgorithm sınıflarında kullanılacak olan ortak fonksiyonları tanımlıyorum. */

	String encrypt(String text);

	String decrypt(String text);

}
