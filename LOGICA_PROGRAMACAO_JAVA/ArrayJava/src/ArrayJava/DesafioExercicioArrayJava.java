package ArrayJava;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class DesafioExercicioArrayJava {

	public static void main(String[] args) {
		
		
		int qtdVezes = 3;
		int[] arrayNum = new int[qtdVezes];
		
		
		for(int i = 0; i < arrayNum.length; i++) {
			
			arrayNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
					
		}
		
		System.out.println("\nNúmeros na ordem digitada\n");
		
		for(int i: arrayNum) {
			System.out.print(" " + i + ", ");
		}
		
		System.out.println("\n\nNúmeros na ordem crescente\n");
		Arrays.sort(arrayNum);
		for(int i: arrayNum) {
			System.out.print(" " + i + ", ");
		}
		

	}

}
