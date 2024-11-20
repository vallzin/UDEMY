package secao13.heranca.application;

import secao13.heranca.entities.Account;
import secao13.heranca.entities.BusinessAccount;
import secao13.heranca.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount( 1002, "Maria", 0.0, 500.00);
		
		//	UPCASTING		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.00);
		
		//gerará um erro 'ClassCastException' em tempo de execução
//		BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if(acc3 instanceof BusinessAccount ) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.00);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		

	}

}
