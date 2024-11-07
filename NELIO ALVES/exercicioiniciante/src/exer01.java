import java.util.Scanner;

public class exer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro:");
		int a = sc.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int b = sc.nextInt();
		
		int soma;
		
		soma = a + b;
		System.out.println("SOMA = "+soma);
		
	}

}
