package exercicio;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentagem;
	

	public double netSalary() {
		return grossSalary - tax;
		
	}
	
	public double increaseSalary() {
		double salary = netSalary();
		return salary += grossSalary * percentagem;
		
	}
	
	public String toString() {
		return "\nEmployee: " + name 
				+ ", $" + String.format("%.2f",grossSalary); 
				
				
		
	}

}
