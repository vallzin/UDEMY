package secao10;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		int qtdPares = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = sc.nextInt();
			
			if(array[i] % 2 == 0) {
				qtdPares++;
			}
			
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.print("  "+ array[i]);
			}
			
		}
		System.out.println();
		System.out.println("\nQUANTIDADES DE PARES = " + qtdPares);
		
		sc.close();

	}

}
