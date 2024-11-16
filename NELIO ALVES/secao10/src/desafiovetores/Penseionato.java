package desafiovetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Penseionato {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] quartos = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			sc.nextLine();
			System.out.println("Rent #" + (i + 1)+":");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numQuarto = sc.nextInt();
			Aluguel inquilino = new Aluguel(nome, email);
			quartos[numQuarto] = inquilino;		
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i +": "+ quartos[i]);
			}
		}
		
		
		sc.close();

	}

}
