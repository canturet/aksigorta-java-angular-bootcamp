package org;

public class Ogrenci extends Kisi {

	private int ogrenciNo;

	private double ortalama;

	private Bolum[] bolumDizisi;

	public Ogrenci() {
		bolumDizisi = new Bolum[2];
		bolumDizisi[0] = new Bolum();
		bolumDizisi[1] = new Bolum();
	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public double getOrtalama() {
		return ortalama;
	}

	public void ortalamaHesapla() {
		System.out.println("Ortalama Hesaplama");
	}

}
