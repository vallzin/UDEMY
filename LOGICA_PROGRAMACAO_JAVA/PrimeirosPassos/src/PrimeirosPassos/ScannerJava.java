package PrimeirosPassos;

import java.util.Scanner;

public class ScannerJava {

	public static void main(String[] args) {
		
		//new -> Instância um objeto da classe
		//Scanner -> objeto da classe Scanner
		//System.in -> lê as informações do teclado
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		//===================================================
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Nome digitado: " + idade);
		
		//__________________________________________________
		
		/*
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroInteiro = scanner.nextInt();
		byte numeroByte = scanner.nextByte();
		long numeroLong = scanner.nextLong();
		boolean numeroBoolean = scanner.nextBoolean();
		float numeroFloat = scanner.nextFloat();
		double numeroDouble = scanner.nextDouble();
		
		*/

	}

}
