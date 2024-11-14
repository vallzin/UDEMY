package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			array[i] = num;
			
		}
		
		System.out.println("NÚMEROS NEGATIVOS");
		for (int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				int numNegativo = array[i];
				System.out.println(numNegativo);
			}
			
		}
		
		
		
		sc.close();

	}

}
