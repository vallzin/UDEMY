package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] alunos = new String[n];
		double[] nota1= new double[n];
		double[] nota2= new double[n];
		
		for (int i = 0; i < nota2.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"° aluno:");
			alunos[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			sc.nextLine();
			nota2[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados: ");
		double soma = 0;
		double media = 0;
		String aluno = "";
		for (int i = 0; i < nota2.length; i++) {
			soma = nota1[i] + nota2[i];
			media = soma / 2;
			if(media >= 6) {
				aluno = alunos[i];
				System.out.println(" "+ aluno);
			}
		}
		
		sc.close();
		

	}

}
