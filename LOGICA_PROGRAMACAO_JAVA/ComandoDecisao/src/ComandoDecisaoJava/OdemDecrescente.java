package ComandoDecisaoJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OdemDecrescente {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("A ordem descrecente dos números é: "+ num1+" é "+num2);
		}else {
			System.out.println("A ordem descrecente dos números é: "+ num2+" é "+num1);
		}
		
		/*
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		
		if(num1 > num2) {
			System.out.println("A ordem descrecente dos números é: "+ num1+" é "+num2);
		}else {
			System.out.println("A ordem descrecente dos números é: "+ num2+" é "+num1);
		}
		*/
	}
}
