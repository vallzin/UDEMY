

import java.util.Locale;
import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da peça");
		int numPeca1 = sc.nextInt();
		System.out.println("Digite o preço por unidade");
		double precoPeca1 = sc.nextDouble();
		System.out.println("Digite a quantidade de peças");
		int qtdPeca1 = sc.nextInt();
		System.out.println("Digite o número da peça");
		int numPeca2 = sc.nextInt();
		System.out.println("Digite o preço por unidade");
		double precoPeca2 = sc.nextDouble();
		System.out.println("Digite a quantidade de peças");
		int qtdPeca2 = sc.nextInt();
		
		double pagar = ((precoPeca1 * qtdPeca1) + (precoPeca2 * qtdPeca2));
		System.out.println("VALOR A PAGAR: R$ "+pagar);
		
		

	}

}
