package Estrutura_Repeticao;

import java.util.Scanner;

public class ExercicioMenorMaiorNumero {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num, maior, menor;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Saindo do loop");
		}else {
			menor = num;
			maior = num;
		
			while(num >= 0) {
			
				if(num > maior) {
				maior = num;
				}
			
				if(num <= menor) {
				menor = num;
				}
				System.out.print("Digite um número: ");
				num = sc.nextInt();
			}
			System.out.println("Maior número: "+ maior);
			System.out.println("Menor número: "+ menor);
		}

	}
}

