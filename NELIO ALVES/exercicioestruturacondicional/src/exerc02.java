import java.util.Locale;
import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}

	}

}
