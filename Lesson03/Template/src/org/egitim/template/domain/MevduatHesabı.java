package org.egitim.template.domain;

public class MevduatHesab─▒ extends Hesap {

	@Override
	protected double vergiHesapla(double bakiye) {
		return bakiye - (bakiye * 0.10);
	}

	@Override
	protected double komisyonHesapla(double bakiye) {
		return bakiye - (bakiye * 0.01);
	}

}
