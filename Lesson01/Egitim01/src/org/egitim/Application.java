package org.egitim;

public class Application {

	public static void main(String[] args) {
		System.out.println("Eğitim 01 Projesi");
		AltSinif altSinif = new AltSinif();
		altSinif.setTanim("TANIM 1");
		System.out.println(altSinif.getTanim());
		altSinif.printUstSinifAdres();
		// AltSinif altSinif2 = altSinif;
		AltSinif altSinif2 = new AltSinif();
		altSinif2.setTanim("TANIM 2");
		altSinif2.printUstSinifAdres();
		System.out.println("alt sınıf 2 : " + altSinif2.getTanim());
		System.out.println("alt sınıf 1 : " + altSinif.getTanim());
		// UstSinif ustSinif = new UstSinif();
		// System.out.println(ustSinif.toString());
		StaticMethods.printDateTime();
		StaticMethods.printProjectName();
	}

}
