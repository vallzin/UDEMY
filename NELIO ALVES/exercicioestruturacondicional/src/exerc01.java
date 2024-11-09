

import java.util.Locale;
import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		

	}

}
