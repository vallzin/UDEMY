import java.util.Locale;
import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combutível abastecido:");
		System.out.println("1 - Alcool; 2 - Gasolina;");
		System.out.println("3 - Diesel; 4 - sair;");
		
		int opcao = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (opcao != 4) {
			
			if(opcao == 1) {
				alcool++;
			}else if (opcao == 2) {
				gasolina++;
			}else if (opcao == 3) {
				diesel++;
			}
			
			
			System.out.println("Combutível abastecido:");
			System.out.println("1 - Alcool; 2 - Gasolina;");
			System.out.println("3 - Diesel; 4 - sair;");
			
			opcao = sc.nextInt();
			
		}
		
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		System.out.println("MUITO OBRIGADO");
	
		
		
		
		sc.close();

	}

}
