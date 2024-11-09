import java.util.Locale;
import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("CÓDIGO  ESPECIFICAÇÃO      PREÇO");
		System.out.println("--------------------------------");
		System.out.println(" 1      Cachorro Quente  R$ 4.00");
		System.out.println(" 2      X-Bacon          R$ 4.50");
		System.out.println(" 3      X-Salada         R$ 5.00");
		System.out.println(" 4      Torrada simples  R$ 4.50");
		System.out.println(" 5      Refrigerante     R$ 1.50");
		System.out.println();
		
		System.out.println("Digite o código e a quantidade");
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		double preco;
		double total;
		
		switch (cod) {
		
		case 1:
			preco = 4.00;
			total = preco * qtd; 
			System.out.println("Total: R$ "+ total);
			break;
		case 2:
			preco = 4.50;
			total = preco * qtd; 
			System.out.println("Total: R$ "+ total);
			break;
		case 3:
			preco = 5.00;
			total = preco * qtd; 
			System.out.println("Total: R$ "+ total);
			break;
		case 4:
			preco = 4.50;
			total = preco * qtd; 
			System.out.println("Total: R$ "+ total);
			break;
		case 5:
			preco = 1.50;
			total = preco * qtd; 
			System.out.println("Total: R$ "+ total);
			break;	

		}

	}

}
