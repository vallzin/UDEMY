package EstruturaRepeticao;

import java.util.Scanner;

public class ComecaVogal {

	public static void main(String[] args) {
		
		String nome;
		int nomesVogal = 0;
		int nomesConsoante = 0;
		
		for(int i = 1; i <=3; i++) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite três nomes");
			nome = sc.nextLine();
			
			if(nome.trim().toLowerCase().charAt(0) == 'a' ||
					nome.trim().toLowerCase().charAt(0) == 'e' ||
					nome.trim().toLowerCase().charAt(0) == 'i' ||
					nome.trim().toLowerCase().charAt(0) == 'o' ||
					nome.trim().toLowerCase().charAt(0) == 'u'){
				
				nomesVogal++;
				nomesConsoante = 3 - nomesVogal;
				System.out.println("Nome com vogal: "+ nomesVogal);
				System.out.println("Total com consoantes: "+ nomesConsoante);
			}
		}

	}

}
