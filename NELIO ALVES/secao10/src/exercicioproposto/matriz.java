package exercicioproposto;

import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite dois números inteiros: ");
		int l = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite os números da matrix "+ l +" por "+ c);
		
		int[][] matrix = new int[l][c];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();	
			}

		}
		
		System.out.print("Qual número da matriz você quer informação? ");
		int num = sc.nextInt();
		boolean existNum = false;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (num == matrix[i][j]) {
					
					existNum = true;
				
					System.out.println("Linha: "+ i +", coluna: "+ j);
		
					if(i > 0) { 
						System.out.println("Em cima: " + matrix[i -1][j]);
					}else {
						System.out.println("Em cima: não existe linha");						
					}
					
					if (j < c - 1) {
						System.out.println("Direita: "+ matrix[i][j + 1]);
					}else {
						System.out.println("Direita: não existe coluna ");
					} 
					
					if (i <l - 1) {
						System.out.println("Embaixo: "+ matrix[i + 1][j]);
					}else {
						System.out.println("Embaixo: não existe linha ");
					}
					
					if (j > 0) {
						System.out.println("Esquerda: "+ matrix[i ][j - 1]);
					}else {
						System.out.println("Esquerda: não existe coluna ");
					}
				}
				
			}
			
		}
		if(!existNum) {
			System.out.println("Número inválido");
		}

		sc.close();

	}

}
