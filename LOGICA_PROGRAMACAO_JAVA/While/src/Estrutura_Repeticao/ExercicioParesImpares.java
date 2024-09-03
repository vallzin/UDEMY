package Estrutura_Repeticao;

import java.util.Scanner;

public class ExercicioParesImpares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, qtdPar, qtdImpar;
		
		num = 0;
		qtdPar = 0;
		qtdImpar = 0;
		
		System.out.println("Digite um número");
		num = sc.nextInt();
		
		while(num >= 0) {
			
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
			if(num > 0) {
				if(num %2 == 0) {
					qtdPar++;
					System.out.println("Qauntidade de números par: "+qtdPar);
				}else {
					qtdImpar++;
					System.out.println("Qauntidade de números ímpares: "+qtdImpar);
				}
			}
			
		}

	}

}
