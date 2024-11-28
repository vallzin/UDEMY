package secao14exercicio.application;

import java.util.Locale;
import java.util.Scanner;

import secao14exercicio.exceptions.BusinessException;
import secao14exercicio.model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.println();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
				
		try {
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		}catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
								
		sc.close();

	}

}
