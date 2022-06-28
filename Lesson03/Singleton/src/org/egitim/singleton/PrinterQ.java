package org.egitim.singleton;

public class PrinterQ {

	private static PrinterQ printerQ;

	private PrinterQ() {

	}

	public static PrinterQ getPrinterQ() {
		if (printerQ == null) {
			printerQ = new PrinterQ();
		}
		return printerQ;
	}

	/* Service Methods */
	public void addQ(byte[] data) {
		// add procedures
	}

	private void printNextJob() {
		// print procedures
	}

}
