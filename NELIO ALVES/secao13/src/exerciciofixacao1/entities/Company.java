package exerciciofixacao1.entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anulaIncome, Integer numberOfEmployees) {
		super(name, anulaIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Double taxPayerCompany() {
		
		double taxPay = 0;
		
		if(numberOfEmployees < 10) {
			taxPay += getAnualIncome() * 0.16;
		}else if(numberOfEmployees > 10){
			taxPay += getAnualIncome() * 0.14;
		}
		
		return taxPay;
	}	
	
	public String toString() {
		return getName()
				+ ": $ "
				+ String.format("%.2f", taxPayerCompany());
	}

}
