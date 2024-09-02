package ComandoDecisaoJava;

import java.util.Scanner;

public class Funcao_IF_ELSEIF_ELSE {

	public static void main(String[] args) {


		//Scanner -> Objeto da classe Scanner
		//In      -> Lê as informações do teclado
		Scanner sc = new Scanner(System.in);
		/*
		int idade;
		
		System.out.println("Digite sua idade:");
		idade = sc.nextInt();
		
		//nextInt -> Lê e retorna um número interio
		if(idade >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		*/
		
		//Exemplo média aluno
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a nota 1:");
		nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2:");
		nota2 = sc.nextDouble();
		System.out.println("Digite a nota 3:");
		nota3 = sc.nextDouble();
		System.out.println("Digite a nota 4:");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			System.out.println("Média: "+media+" - Situação aprovada");
		}else if(media >= 5) {
			System.out.println("Média: "+media+" - Situação recuperação");
		}else {
			System.out.println("Média: "+media+" - Situação reprovado");	
		}
	}
}
