import java.util.Locale;
import java.util.Scanner;

public class exerc8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		double imposto;
		
		if(salario <= 2000.0) {
			
			imposto = 0.0;
			
		}else if(salario <= 3000.0) {
			
			imposto = (salario - 2000) + .08;
			
			System.out.printf("R$ %.2f%n", imposto);
			
		}else if(salario <= 4500) {
			
			imposto = (salario - 3000) * 0.18 + 1000.0 * .08;
			
		}else {
			
			imposto = (salario - 4500) * .28 + 1500 * .18 + 1000 * .08; 
			
		}
				
		if(imposto == 0.0) {
			
			System.out.printf("Isento");
			
		}else {
				
			System.out.printf("R$ %.2f%n", imposto);
			
		}
		
		sc.close();

	}

}
