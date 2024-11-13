package exercicio;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentagem;
	
//	public Employee() {
//		
//	}
//	
//	public Employee(String name, double grossSalary, double tax, 
//			double percentagem) {
//		super();
//		this.name = name;
//		this.grossSalary = grossSalary;
//		this.tax = tax;
//		this.percentagem = percentagem;
//	}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setGrossSalary(double grossSalary) {
//		this.grossSalary = grossSalary;
//	}
//
//	public void setTax(double tax) {
//		this.tax = tax;
//	}
//
//	public void setPercentagem(double percentagem) {
//		this.percentagem = percentagem;
//	}
//
//	public double getPercentagem() {
//		return percentagem;
//	}

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
