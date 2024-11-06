package curso_programacao;

import java.util.Locale;

/**
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		int y = 32;
		
		String nome = "Maria";
		int idade = 32;
		double renda = 5000.0;
	
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println();
		double x = 10.356879;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + "METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
		
	}

}
