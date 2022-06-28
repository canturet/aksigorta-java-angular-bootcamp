package org.egitim.singleton;

public class Blueprint {

	public void printBluePrint() {
		// ...
		// ...
		// PrinterQ printerQ = new PrinterQ();

		PrinterQ printerQ = PrinterQ.getPrinterQ();
		printerQ.addQ(null);
		System.out.println(printerQ);

		System.out.println(PrinterQ.getPrinterQ());
		System.out.println(PrinterQ.getPrinterQ());
		System.out.println(PrinterQ.getPrinterQ());
	}

}
