package secao10;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		char[] sexos = new char[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < sexos.length; i++) {
			System.out.print("Altura da "+(i+1)+" pessoa: ");
			alturas[i] = sc.nextDouble();
			sc.nextLine();
			System.out.print("Gênero da "+(i+1)+" pessoa: ");
			sexos[i] = sc.next().charAt(0);			
			sc.nextLine();
		}
		
		double maiorAltura = alturas[0];
		double menorAltura= alturas[0];
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		
		System.out.println("Menor altura = "+ menorAltura);
		System.out.println("Maior altura = "+ maiorAltura);
		
		double soma = 0;
		double media = 0;
		int qtdF = 0;
		int qtdM = 0;
		for (int i = 0; i < alturas.length; i++) {
			
			if (sexos[i] == 'f' || sexos[i] == 'F') {
				soma += alturas[i];
				qtdF++;
				media = soma / qtdF;
			}
			
			if (sexos[i] == 'm' || sexos[i] == 'M') {
				qtdM++;	
			}
			
		}
		System.out.println("Média das alturas das mulheres = "+ media);
		System.out.println("Número de homens = "+ qtdM);
		
		sc.close();
	}

}
