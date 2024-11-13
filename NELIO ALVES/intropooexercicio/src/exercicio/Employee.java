package exercicio;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentagem;
	

	public double netSalary() {
		return this.grossSalary - this.tax;
		
	}
	
	public double increaseSalary() {
		double salary = netSalary();
		return salary += grossSalary * this.percentagem;
		
	}
	
	public String toString() {
		return "\nEmployee: " + name 
				+ ", $" + String.format("%.2f",grossSalary); 
				
				
		
	}

}
