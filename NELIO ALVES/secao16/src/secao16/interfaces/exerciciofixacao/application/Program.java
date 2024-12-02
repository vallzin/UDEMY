package secao16.interfaces.exerciciofixacao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.interfaces.exerciciofixacao.entities.Contract;
import secao16.interfaces.exerciciofixacao.entities.Installment;
import secao16.interfaces.exerciciofixacao.services.ContractService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse( sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(num, date, totalValue);
		
		System.out.println("Entre com o número de parcelas");
		int n = sc.nextInt();
		
		
		ContractService contractService = new ContractService(null);
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas:");
		for(Installment i : obj.getInstallments()) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
