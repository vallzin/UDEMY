package Program;

import java.util.Locale;
import java.util.Scanner;

import exercicio.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		sc.nextLine();
		

		System.out.println(emp);
	    System.out.println();
	    System.out.print("Which percentage to increase salary? " );
	    emp.percentagem = sc.nextDouble();
	    sc.nextLine();
	    System.out.println();
	    System.out.println("Update data: "+emp.name+", $"+emp.increaseSalary());
	    
		
		sc.close();

	}

}
