package org.egitim.hibernate.test;

import java.util.ArrayList;

import org.egitim.hibernate.model.data.Kisi;
import org.egitim.hibernate.model.data.Sehir;
import org.egitim.hibernate.model.data.Ulke;
import org.egitim.hibernate.system.DBConnector;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class HibernateTest {

	private static Session session;

	@BeforeAll
	public static void setSession() {
		session = DBConnector.getSessionFactory().openSession();
	}

	@Test
	@Disabled
	public void testKisiSelect() {
		ArrayList<Kisi> kisiList = (ArrayList<Kisi>) session.createSelectionQuery("FROM Kisi").list();
		for (Kisi kisi : kisiList) {
			System.out.println("T.C. Kimlik No. : " + kisi.getTcKimlikNo());
			System.out.println("Ad : " + kisi.getAd());
			System.out.println("Soyad : " + kisi.getSoyad());
		}
	}

	@Test
	@Disabled
	public void testUlkeSelect() {
		ArrayList<Ulke> ulkeList = (ArrayList<Ulke>) session.createSelectionQuery("FROM Ulke").list();
		for (Ulke ulke : ulkeList) {
			System.out.println("Ad : " + ulke.getAd());
			System.out.println("Resmi Ad : " + ulke.getResmiAd());
		}
	}

	@Test
	@Disabled
	public void insertUlke() {
		Ulke ulke = new Ulke();
		ulke.setAd("Japonya");
		ulke.setResmiAd("Japonya RA");
		ulke.setTelefonKod("55");
		ulke.setPlakaKod("JP");
		session.beginTransaction();
		try {
			session.persist(ulke);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		testUlkeSelect();
	}

	@Test
	@Disabled
	public void updateUlkeBayrak() {
		ArrayList<Ulke> ulkeList = (ArrayList<Ulke>) session.createSelectionQuery("FROM Ulke").list();
		for (Ulke ulke : ulkeList) {
			session.beginTransaction();
			try {
				ulke.setBayrak("opt/egitim/bayraklar/" + ulke.getPlakaKod() + ".png");
				session.merge(ulke);
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
			}
		}
	}

	@Test
	@Disabled
	public void deleteHataliKisiKayit() {
		/* JPQL */
		String jpql = "select kisi from Kisi kisi where kisi.tcKimlikNo like '5%'";
		ArrayList<Kisi> silinecekKisiList = (ArrayList<Kisi>) session.createSelectionQuery(jpql).list();
		for (Kisi kisi : silinecekKisiList) {
			System.out.println(kisi.getViewString());
			session.beginTransaction();
			try {
				session.remove(kisi);
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
			}

		}
	}

	@Test
	@Disabled
	public void testManyToOne() {
		ArrayList<Sehir> sehirList = (ArrayList<Sehir>) session.createSelectionQuery("FROM Sehir").list();
		for (Sehir sehir : sehirList) {
			System.out.println(sehir.getViewString());
		}
	}

	@Test
	public void testOneToMany() {
		ArrayList<Ulke> ulkeList = (ArrayList<Ulke>) session.createSelectionQuery("FROM Ulke").list();
		for (Ulke ulke : ulkeList) {
			System.out.println(ulke.getViewString());
		}
	}

}
