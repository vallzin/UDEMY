package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = sc.nextDouble();			
		}
		
		double soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		System.out.printf("SOMA = %.2f", soma);
		
		double media = 0;
		
		media = soma / array.length;
		
		System.out.printf("MÉDIA = %.2f", media);
		
		
		sc.close();
		

	}

}
