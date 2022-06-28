package org.egitim.template.domain;

public class DovizHesabı extends Hesap {

	@Override
	protected double vergiHesapla(double bakiye) {
		return bakiye - (bakiye * 0.2);
	}

	@Override
	protected double komisyonHesapla(double bakiye) {
		return bakiye - (bakiye * 0.03);
	}

}
