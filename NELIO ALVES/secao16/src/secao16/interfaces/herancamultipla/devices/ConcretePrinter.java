package secao16.interfaces.herancamultipla.devices;

public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printing processing: " + doc);
		
	}
	
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}


}
