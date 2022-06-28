package org;

import java.util.ArrayList;
import java.util.List;

public class OgretimUyesi extends Kisi {

	private String sicilNo;

	private List<Bolum> bolumListe;

	public String getSicilNo() {
		return sicilNo;
	}

	public OgretimUyesi() {
		bolumListe = new ArrayList<Bolum>();
		Bolum bolum = new Bolum();
		bolumListe.add(bolum);
	}

}
