package secao16.interfaces.solucaoproblema.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.interfaces.solucaoproblema.model.entities.CarRental;
import secao16.interfaces.solucaoproblema.model.entities.Vehicle;
import secao16.interfaces.solucaoproblema.model.services.BrazilTaxService;
import secao16.interfaces.solucaoproblema.model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: "+ String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: "+ String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: "+ String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		sc.close();

	}

}
