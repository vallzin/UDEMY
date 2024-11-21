package exerciciofixacao1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerciciofixacao1.entities.Company;
import exerciciofixacao1.entities.Individual;
import exerciciofixacao1.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> txP = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i <n; i++) {
			System.out.println("Tax payer #" +(i + 1) +" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			sc.nextLine();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double heath = sc.nextDouble();
				
				Individual ind = new Individual(name, income, heath);
				
				txP.add(ind);
				
			}else {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				
				Company cmp = new Company(name, income, employee);
				
				txP.add(cmp);
				
			}
			
			
			System.out.println("TAXES PAID:");
			for (TaxPayer taxP : txP) {
				System.out.println(taxP);
			}
			
		}
		
		sc.close();

	}

}
