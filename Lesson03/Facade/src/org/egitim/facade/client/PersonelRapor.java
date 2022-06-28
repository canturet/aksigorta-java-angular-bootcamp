package org.egitim.facade.client;

import org.egitim.facade.library.FileConverter;

public class PersonelRapor {

	public void convertPersonelKimlikToPdf() {

		FileConverter fileConverter = new FileConverter();
		fileConverter.convertFile(getKimlikDoc(), "doc");

	}

	private byte[] getKimlikDoc() {
		// File System Read
		return null;
	}

}
