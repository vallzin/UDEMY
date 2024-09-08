package ArrayJava;

import java.util.Arrays;

public class ArrayJava1 {

	public static void main(String[] args) {
		
		//final -> contante que pode ser usando em qualquer parte
		final int tamanho = 3;
		
		int[] precos = new int[tamanho];
		
		precos[0] = 18;
		precos[1] = 56;
		precos[2] = 90;
		
		System.out.println();
		System.out.println("Imprimindo Array de preços\n");
		
		for(int i = 0; i < precos.length; i++) {
			
			System.out.println("O preço: "+ (i + 1) + " : R$ "+ precos[i]);
		}
		
		//-----------------------------------------------------------------
		
		String[] letras = {"Z", "G", "J", "w", "P", "Q", "M"};
		
		System.out.println("\n Imprimindo Array de letras usando for\n");
		
		for(String l : letras) {
			
			System.out.print(" "+l+",");
		}
		
		//------------------------------------------------------------------
		
		int[] num = {1, 2, 5, 7, 8, 9, 12, 34, 66, 32};
		
		System.out.print("\n\n>>> Arrays de números <<<\n\n");
		
		for(int n : num) {
			System.out.print(" " + n + ", ");
		}
		
		//-----------------------------------------------------------
		//fill -> preenche o Array com um valor pre-determinado
		Arrays.fill(num, 5);
		System.out.print("\n\n>>> Arrays de números usando fill <<<\n\n");
		
		for(int n: num) {
			System.out.print(" " + n + ", ");
		}
		
		//-----------------------------------------------------------
		//fill -> preenche o Array com um valor pre-determinado
		Arrays.fill(letras, "V");
		System.out.print("\n\n>>> Arrays de letras usando fill <<<\n\n");
				
		for(String l: letras) {
			System.out.print(" " +  l+ ", ");
		}
	}
	
}
