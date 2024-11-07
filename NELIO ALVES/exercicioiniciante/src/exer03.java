

import java.util.Locale;
import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro: ");
		int A = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o segundo valor inteiro: ");
		int B = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o terceiro valor inteiro: ");
		int C = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o quarto valor inteiro: ");
		int D = sc.nextInt();
		sc.nextLine();
		
		int diferenca = (A*B - C *D);
		System.out.println("DIFERENÇA: "+ diferenca);
		
	}
}
