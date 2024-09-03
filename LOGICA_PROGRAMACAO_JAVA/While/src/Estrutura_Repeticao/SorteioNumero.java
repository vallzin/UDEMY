package Estrutura_Repeticao;

import java.util.Random;
import java.util.Scanner;

public class SorteioNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int palpite, tentativas = 0;
		Random random = new Random();
		boolean acertou = false;
		
		int num = random.nextInt(101);
		
		while(acertou == false) {
			
			System.out.println("Digite um número entre zero e cem");
			palpite = sc.nextInt();
			tentativas++;
			
			if(palpite == num) {
				System.out.println("Você acertou o número");
				break;
			}else if(palpite > num){
				System.out.println("O palpite é maior do que o número");
				System.out.println("Quantidades de tentativas: "+tentativas);
			}else {
				System.out.println("O palpite é menor do que o número");
				System.out.println("Quantidades de tentativas: "+tentativas);
			}
			
		}
		
	}

}
