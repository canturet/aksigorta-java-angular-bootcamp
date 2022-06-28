package org.egitim.facade.library;

import java.io.InputStream;

public class FileConverter {

	public void convertFile(byte[] file, String fileType) {
		convertFileType(file, fileType);
	}

	public void convertFile(byte[] file) {
		String fileType = detectFileType(file);
		convertFileType(file, fileType);
	}

	private String detectFileType(byte[] file) {
		// File Header -> Type procedures
		return "doc";
	}

	private void convertFileType(byte[] file, String fileType) {
		if (fileType.equalsIgnoreCase("doc")) {
			DocToPdf docToPdf = new DocToPdf();
			docToPdf.convertDocument(file);
		} else if (fileType.equalsIgnoreCase("txt")) {
			TextToPdf textToPdf = new TextToPdf();
			textToPdf.convertText(file);
		} else if (fileType.equalsIgnoreCase("xls")) {
			XlsToPdf xlsToPdf = new XlsToPdf();
			xlsToPdf.xlsConvert(file);
		} else if (fileType.equalsIgnoreCase("csv")) {
			XlsToPdf xlsToPdf = new XlsToPdf();
			xlsToPdf.csvConvert(byteArrayToStream(file));
		} else {
			return;
		}
	}

	private InputStream byteArrayToStream(byte[] file) {
		// Byte to Stream procedures
		return null;
	}

}
