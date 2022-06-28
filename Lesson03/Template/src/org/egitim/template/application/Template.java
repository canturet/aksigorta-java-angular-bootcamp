package org.egitim.template.application;

import org.egitim.template.domain.DovizHesabı;
import org.egitim.template.domain.FonHesap;
import org.egitim.template.domain.MevduatHesabı;

public class Template {

	public static void main(String[] args) {
		DovizHesabı dovizHesap = new DovizHesabı();
		System.out.println("Döviz : ");
		dovizHesap.bakiyeGoruntule();
		System.out.println(" ");
		FonHesap fonHesap = new FonHesap();
		System.out.println("Fon : ");
		fonHesap.bakiyeGoruntule();
		System.out.println(" ");
		MevduatHesabı mevduatHesap = new MevduatHesabı();
		System.out.println("Vadeli Mevduat : ");
		mevduatHesap.bakiyeGoruntule();
		System.out.println(" ");
	}

}
