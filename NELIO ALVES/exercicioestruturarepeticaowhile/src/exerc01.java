import java.util.Locale;
import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		boolean login = false;
		
		while(!login) {
			
			if(senha == 2002) {
				login = true;
				break;
			}
			
			System.out.print("Digite sua senha: ");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Logando com sucesso!");
		
		sc.close();

	}

}
