package secao10;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] vetorP = new String[n];
		int[] vetorI = new int[n];
		
		for (int i = 0; i < vetorP.length; i++) {
			System.out.println("Dados da "+(i + 1) + "º pessoa:" );
			System.out.print("Nome: ");
			vetorP[i] = sc.next();
			System.out.print("Idade: ");
			vetorI[i] = sc.nextInt();
		}
		
		int maior = 0;
		String pessoa = "";
		for (int i = 0; i < vetorI.length; i++) {
			
			if (vetorI[i] > maior) {
				maior = vetorI[i];
				pessoa = vetorP[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: "+ pessoa);
		
		

	}

}
