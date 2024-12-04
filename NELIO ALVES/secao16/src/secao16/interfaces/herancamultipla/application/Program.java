package secao16.interfaces.herancamultipla.application;


import secao16.interfaces.herancamultipla.devices.ComboDevice;
import secao16.interfaces.herancamultipla.devices.ConcretePrinter;
import secao16.interfaces.herancamultipla.devices.ConcreteScanner;

public class Program {
	
	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My mail");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2356");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
		
	}

}
