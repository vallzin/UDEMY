package secao10;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();			
		}
		
		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i] / vetor.length;
			
		}
		
		System.out.println("MÉDIA DO VETOR = "+ media);
		System.out.println("ELEMENTOS ABAIXO DA MÉIDA:");
		
		for (int i = 0; i < vetor.length; i++) {			
			if(vetor[i] < media) {
				System.out.println(" " + vetor[i] );
			}
		}
		
		
		
		
		
		sc.close();

	}

}
