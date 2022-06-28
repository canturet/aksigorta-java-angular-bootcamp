package org.egitim.template.domain;

public class FonHesap extends Hesap {

	@Override
	protected double vergiHesapla(double bakiye) {
		return bakiye - (bakiye * 0.15);
	}

	@Override
	protected double komisyonHesapla(double bakiye) {
		return bakiye - (bakiye * 0.02);
	}

}
