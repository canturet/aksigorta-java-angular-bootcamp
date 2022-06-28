package org;

import java.util.ArrayList;
import java.util.List;

public class Bolum {

	private List<OgretimUyesi> ogretimUyesiListe;

	public Bolum() {
		ogretimUyesiListe = new ArrayList<OgretimUyesi>();
		OgretimUyesi ogretimUyesi = new OgretimUyesi();
		ogretimUyesiListe.add(ogretimUyesi);
	}

}
