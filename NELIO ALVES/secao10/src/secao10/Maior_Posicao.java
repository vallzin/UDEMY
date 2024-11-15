package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] mPosicao = new double[n];
		
		for (int i = 0; i < mPosicao.length; i++) {
			System.out.print("Digite um número: ");
			mPosicao[i] = sc.nextDouble();
		}
		
		double maior = 0;
		int posicao = 0;
		for (int i = 0; i < mPosicao.length; i++) {
			if (mPosicao[i] > maior) {
				maior = mPosicao[i];
				posicao = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.2f%n", maior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicao);
		
		sc.close();
		

	}

}
