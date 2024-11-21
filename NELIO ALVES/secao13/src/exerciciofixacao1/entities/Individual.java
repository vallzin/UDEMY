package exerciciofixacao1.entities;

public class Individual extends TaxPayer{
	
	private Double heathExpediture;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double heathExpediture) {
		super(name, anualIncome);
		this.heathExpediture = heathExpediture;
	}

	public Double getHeathExpediture() {
		return heathExpediture;
	}

	public void setHeathExpediture(Double heathExpediture) {
		this.heathExpediture = heathExpediture;
	}

	@Override
	public double tax() {
		
		double taxPay = 0;
		
		if(heathExpediture > 0) {
			if(getAnualIncome() < 20000.00) {
				taxPay += (getAnualIncome() * 0.15) - (heathExpediture * 0.50);
			}else {
				taxPay += (getAnualIncome() * 0.25) - (heathExpediture * 0.50);
			}
		}else {
			if(getAnualIncome() < 20000.00) {
				taxPay += (getAnualIncome() * 0.15);
			}else {
				taxPay += (getAnualIncome() * 0.25);
			}
		}
		
		return taxPay;
	}
	
	public String toString() {
		return getName()
				+ ": $ "
				+ String.format("%.2f", tax());
	}

}
