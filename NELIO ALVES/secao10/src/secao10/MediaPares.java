package secao10;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		
		double somaPares = 0;
		double qtdPares = 0;
		double mediaPares = 0;
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] % 2 == 0) {				
//				somaPares += vetor[i];
				qtdPares++;
				mediaPares = (somaPares += vetor[i]) / qtdPares;
				
			}
		}
		
		if(mediaPares != 0) {
			System.out.println("MÉDIA DOS PARES "+ mediaPares);
			
		}else{
			System.out.println("NENHUM NÚMERO É PAR");
		}
		
		
		
		
	}

}
