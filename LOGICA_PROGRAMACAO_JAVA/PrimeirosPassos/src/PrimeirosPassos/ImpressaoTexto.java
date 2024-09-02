package PrimeirosPassos;

public class ImpressaoTexto {
	
	public static void main(String[] args) {
		
		//\n -> caractere de escape que faz a quegra de linha
		System.out.println("Olá, Mundo!\n");
		//printl -> coloca o curso na linha de baixo
		System.out.println("Text simples");
		System.out.println("Text simples 2");
		/*
		 * printf -> impressão formatada
		 * %s -> String/Texto
		 * %d -> Inteiro
		 * %f -> Float
		 * %b -> Boolean TRUE ou FALSE
		 * */
		System.out.printf("%s", "Nome: Maira José\n");
		System.out.printf("%s idade: %d", "Nome: Maria José", 30);
		//%n -> quebra de linha ultilizada no printf
		System.out.printf("%n%nNome: %s %nIdade: %d", "Nome: Maria José", 30);
		
		//variável -> espaço para armazenamento temporário
		int numero1 = 5;
		int numero2 = 10;
		
		System.out.printf("\n\nSoma dos números: %d", (numero1 + numero2));
		
	}

}
