package secao16.interfaces.deafaultmetodos.application;

import java.util.Locale;
import java.util.Scanner;

import secao16.interfaces.deafaultmetodos.services.BrazilInterestService;
import secao16.interfaces.deafaultmetodos.services.InterestService;
import secao16.interfaces.deafaultmetodos.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		InterestService is1 = new UsaInterestService(1.0);
		double payment1 = is1.payment(amount, months);
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment1));
		
		sc.close();
		

	}

}
