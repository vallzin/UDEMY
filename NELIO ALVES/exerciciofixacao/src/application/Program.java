package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBanco conta;
		
		System.out.print("Digite o número da Conta Bancária: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do titular: ");
		String titular = sc.nextLine();
		System.out.print("Tem depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Digite o valor do depósito: ");
			double depositoInicio = sc.nextDouble();
			sc.nextLine();
			conta = new ContaBanco(numConta, titular, depositoInicio);
		}else {
			conta = new ContaBanco(numConta, titular);
		}
		
		System.out.println();
		System.out.println(conta);
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Conta atualizada: ");
		System.out.println(conta);
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		conta.sacar(sc.nextDouble());
		System.out.println("Conta atualizada: ");
		System.out.println(conta);
		
		
		
		sc.close();
		
	}
}
