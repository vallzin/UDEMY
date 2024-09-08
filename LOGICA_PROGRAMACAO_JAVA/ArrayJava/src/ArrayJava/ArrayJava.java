package ArrayJava;

public class ArrayJava {

	public static void main(String[] args) {
		
		
		int n1, n2, n3, n4, n5;
		
		n1 = 10;
		n2 = 12;
		n3 = 5;
		n4 = 29;
		n5 = 70;
		
		System.out.println("Exemplo com variáveis");
		System.out.println("Número 1: "+ n1);
		System.out.println("Número 2: "+ n2);
		System.out.println("Número 3: "+ n3);
		System.out.println("Número 4: "+ n4);
		System.out.println("Número 5: "+ n5);
		
		
		/*
		 imprimindo um array
		 */

		//[] -> Significa que estou criando um array
		int[] num = new int[5];
		
		num[0] = 10;
		num[1] = 12;
		num[2] = 5;
		num[3] = 29;
		num[4] = 70;
		
		System.out.println("\nImprimindo o Array com números\n");
		System.out.println("Posição 0: "+ num[0]);
		System.out.println("Posição 1: "+ num[1]);
		System.out.println("Posição 2: "+ num[2]);
		System.out.println("Posição 3: "+ num[3]);
		System.out.println("Posição 4: "+ num[4]);
		
		//-------------------------------------------------
		
		String[] letras = {"A", "B", "C", "D", "E"};
		
		System.out.println("\nImprimindo o Array com letras\n");
		System.out.println("Posição 0: "+ letras[0]);
		System.out.println("Posição 1: "+ letras[1]);
		System.out.println("Posição 2: "+ letras[2]);
		System.out.println("Posição 3: "+ letras[3]);
		System.out.println("Posição 4: "+ letras[4]);
		
		System.out.println();
		System.out.println("usando o for para imprimir o Array");
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Letras posição "+ i +" : "+ letras[i]);
		}
		
		
		
	}

}
