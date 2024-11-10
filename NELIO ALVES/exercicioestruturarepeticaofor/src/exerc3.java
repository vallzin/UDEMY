import java.util.Locale;
import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor inteiro entre 1 e 10: ");
		
		int N = sc.nextInt();
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		double mediaPond = 0;
		
		for(int i = 0; i < N; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();
			mediaPond = ((peso1*num1)+(peso2*num2)+(peso3*num3))/(peso1+peso2+peso3);
			
			System.out.printf("%.1f%n",mediaPond);
		}
		
		
		sc.close();

	}

}
