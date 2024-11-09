import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		sc.nextLine();
		
		int soma = 0;
		while(x != 0) {
			
			soma = soma + x;
			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();
			sc.nextLine();
			
			
		}
		System.out.print("Soma dos números: " + soma+"\n");
		System.out.println("Saindo do programa...");
		sc.close();

	}

}
