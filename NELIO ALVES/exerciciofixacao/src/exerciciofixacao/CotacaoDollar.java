package exerciciofixacao;

import entities.CurrencyConverter;

public class CotacaoDollar {
	
	public double price;
	public double quantity;
	
	public CotacaoDollar() {
		
	}

	public String toString() {
		return "Amount to be paid int reais = "
				+ String.format("%.2f", CurrencyConverter.total(price, quantity));
	}
	
}
