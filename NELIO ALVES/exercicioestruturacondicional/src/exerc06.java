import java.util.Locale;
import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 100");
		double num = sc.nextDouble();
		
		if(num >= 0 && num < 25) {
			System.out.println("Intervalo [0, 25]");
		}else if(num >= 25 && num < 50) {
			System.out.println("Intervalo [25, 50]");
		}else if(num >= 50 && num < 75) {
			System.out.println("Intervalo [50, 75]");
		}else if(num >= 75) {
			System.out.println("Intervalo [75, 100]");
		}else {
			System.out.println("Fora do Intervalo");
		}
		
		sc.close();
		

	}

}
