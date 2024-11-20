package secao13.heranca.application;

import java.util.ArrayList;
import java.util.List;

import secao13.heranca.entities.Account;
import secao13.heranca.entities.BusinessAccount;
import secao13.heranca.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
//		Account acc = new Account(1001, "Alex", 0.0);
//		BusinessAccount bacc = new BusinessAccount( 1002, "Maria", 0.0, 500.00);
//		
//		//	UPCASTING		
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003,"Bob", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//		
//		//DOWNCASTING
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.00);
//		
//		//gerará um erro 'ClassCastException' em tempo de execução
////		BusinessAccount acc5 = (BusinessAccount) acc3;
//		
//		if(acc3 instanceof BusinessAccount ) {
//			BusinessAccount acc5 = (BusinessAccount) acc3;
//			acc5.loan(500.00);
//			System.out.println("Loan!");
//		}
//		
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount) acc3;
//			acc5.updateBalance();
//			System.out.println("Update!");
//		}
//		
//		Account acc6 = new Account(1006, "Alex", 1000.00);
//		acc6.withdraw(200.00);
//		System.out.println(acc6.getBalance());
//		
//		Account acc7 = new SavingsAccount(1007, "Maria", 1000.00, 0.01);
//		acc7.withdraw(200.00);
//		System.out.println(acc7.getBalance());
//		
//		Account acc8 = new BusinessAccount(1008, "Bob", 1000.00, 500.00);
//		acc8.withdraw(200.00);
//		System.out.println(acc8.getBalance());
//		
//		Account x = new Account(1020, "Alex", 1000.00);
//		Account y = new SavingsAccount(1023, "Maria", 1000.00, 0.01);
//		
//		x.withdraw(50.00);
//		y.withdraw(50.00);
//		
//		System.out.println(x.getBalance());
//		System.out.println(y.getBalance());
		
//		
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maira", 1000.00, 400.00));
		list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());	
		}
		

	}

}
