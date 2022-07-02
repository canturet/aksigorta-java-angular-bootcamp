package org;

import java.util.ArrayList;
import java.util.List;

public class Kisi implements ILog {

	private String ad;

	protected int id;

	private String kimlikNo;

	private String soyad;

	private List<Adres> adresListe;

	public Kisi() {
		adresListe = new ArrayList<Adres>();
		Adres adres = new Adres();
		adresListe.add(adres);
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Override
	public void log() {
		System.out.println("Kişi Log");
	}

}
