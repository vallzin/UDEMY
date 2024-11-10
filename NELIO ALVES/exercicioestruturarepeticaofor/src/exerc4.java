import java.util.Locale;
import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor inteiro entre 1 e 10: ");
		int N = sc.nextInt();
		
		int num1;
		int num2;
		
		for(int i = 0; i < N; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if(num1 != 0 && num2 != 0) {
				double div =(double) num1 / num2;
				System.out.println(div);
			}else if(num1 == 0 && num2 != 0) {
				System.out.println(0.0);
			}else {
				System.out.println("divisão impossível");
			}
			
		}
		
		
		sc.close();

	}

}
