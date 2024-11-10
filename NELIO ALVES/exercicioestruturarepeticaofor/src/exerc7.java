import java.util.Locale;
import java.util.Scanner;

public class exerc7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
		int N = sc.nextInt();
		
		
		for(int i = 1; i <= N; i++){
			
			int q = i * i;
			int t = i * i * i;
			
			System.out.print(" "+i);
			System.out.print(" "+ q);
			System.out.println(" "+ t);
		
			
		}
		
		sc.close();

	}

}
