package org.egitim.hibernate.model.data;

import java.util.List;

import org.egitim.hibernate.model.data.base.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "ULKE")
public class Ulke extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private List<Sehir> sehir;
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

	@OneToMany(mappedBy = "ulke", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	public List<Sehir> getSehir() {
		return sehir;
	}

	public void setSehir(List<Sehir> sehir) {
		this.sehir = sehir;
	}

	@Override
	@Transient
	public String getViewString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getAd()).append(" (").append(getSehir().toString()).append(")");
		return sb.toString();
	}

}
