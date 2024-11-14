package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < alturas.length; i++) {
			
			System.out.println("Dados da " + (i + 1) + " pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Alturas: ");
			alturas[i] = sc.nextDouble();
		}
		
		double soma = 0;
		double media = 0;
		for(int i = 0; i < alturas.length; i++) {
			soma += alturas[i];
			media = soma / alturas.length;
		}
		
		double menor16 = 0;
		double menor16Percent = 0;
		String[] nomeMenor16;
		for (int i = 0; i < idades.length; i++) {			
			if(idades[i] < 16) {
				menor16++;
			}
			
			menor16Percent = (menor16 * 100 ) / idades.length ;
			
		}
		
		
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", menor16Percent);
		
		for (int i = 0; i < idades.length; i++) {
			if(idades[i] < 16) {
				System.out.printf("%s%n", nomes[i]);
			
			}
		}
		
		
		sc.close();

	}
}
		


