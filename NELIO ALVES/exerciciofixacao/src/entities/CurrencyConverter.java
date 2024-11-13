package entities;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double total(double valor, double quantidade) {
		double qtdTotal = valor * quantidade;
		double totalPercent = qtdTotal * IOF;
		double total = qtdTotal + totalPercent;
		return total;
	}

}
