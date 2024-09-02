package EstruturaRepeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, fatorial;
		
		fatorial = 1;
		
		System.out.println("Digite um números inteiro:");
		num = sc.nextInt();
		
		for(int i = num; i >= 1; i--){
			fatorial = fatorial * i;
	
		}
		System.out.println(" O fatorial do "+num+": "+fatorial);
		
	}
	
}
