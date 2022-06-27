package org.egitim;

import java.util.ArrayList;
import java.util.List;

public class Kisi {

	private String ad;

	protected int id;

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

	public List<Adres> getAdresListe() {
		return adresListe;
	}

	public void setAdresListe(List<Adres> adresListe) {
		this.adresListe = adresListe;
	}

}
