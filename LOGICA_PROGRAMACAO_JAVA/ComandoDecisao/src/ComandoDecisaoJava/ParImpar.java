package ComandoDecisaoJava;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");		
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("O Número " + num + " é par");
		}else {
			System.out.println("O Número " + num + " é  ímpar");
		}

	}

}
