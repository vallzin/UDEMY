import java.util.Locale;
import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double r = sc.nextDouble();
		
		double PI = 3.14159;
		double A = PI * Math.pow(r, 2);
		
		System.out.printf("Área do Círculo: %.4f", A);

	}

}
