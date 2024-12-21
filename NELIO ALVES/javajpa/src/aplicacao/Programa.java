package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Carlos Alberto", "carlos@email.com");
		Pessoa p2 = new Pessoa(2, "Jose Afonso", "jose@email.com");
		Pessoa p3 = new Pessoa(3, "Antonio Carlos", "antonio@email.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
