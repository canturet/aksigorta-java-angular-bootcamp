package org.egitim.hibernate.model.data;

import org.egitim.hibernate.model.data.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "ULKE")
public class Ulke extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String ad;
	private String resmiAd;
	private String telefonKod;
	private String plakaKod;
	private String bayrak;

	@Column(name = "AD", length = 50, nullable = false)
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Column(name = "RESMI_AD", length = 100, nullable = false)
	public String getResmiAd() {
		return resmiAd;
	}

	public void setResmiAd(String resmiAd) {
		this.resmiAd = resmiAd;
	}

	@Column(name = "TELEFON_KOD", length = 5, nullable = false)
	public String getTelefonKod() {
		return telefonKod;
	}

	public void setTelefonKod(String telefonKod) {
		this.telefonKod = telefonKod;
	}

	@Column(name = "PLAKA_KOD", length = 5, nullable = false)
	public String getPlakaKod() {
		return plakaKod;
	}

	public void setPlakaKod(String plakaKod) {
		this.plakaKod = plakaKod;
	}

	@Column(name = "BAYRAK", length = 250, nullable = true)
	public String getBayrak() {
		return bayrak;
	}

	public void setBayrak(String bayrak) {
		this.bayrak = bayrak;
	}

	@Override
	@Transient
	public String getViewString() {
		// TODO Auto-generated method stub
		return null;
	}

}
