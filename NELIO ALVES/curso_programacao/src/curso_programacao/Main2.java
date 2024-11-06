package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		System.out.print("Digite uma palavra: ");
		x = sc.next();
		System.out.println("Você digitou: "+ x);
		System.out.println();
		int y;
		System.out.print("Digite um número inteiro: ");
		y = sc.nextInt();
		System.out.println("Você digitou: "+ y);
		System.out.println();
		double b;
		System.out.print("Digite um número decimal: ");
		b = sc.nextDouble();
		System.out.println("Você digitou: "+ b);
		System.out.printf("Você digitou %.2f%n", b);
		System.out.println();
		char s;
		System.out.print("Digite uma letra: ");
		s = sc.next().charAt(0);
		System.out.println("Você digitou: "+ s);
		System.out.println();
		String a, f, g;
		System.out.println("Digite alguns dados: ");
		a = sc.next();
		f = sc.next();
		g = sc.next();
		System.out.println("dados digitados: ");
		System.out.println(" "+a+", "+f+", "+g);
		System.out.println();
		
		sc.close();

	}

}
