import java.util.Locale;
import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de começo e fim do jogo");
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		
		int total = 0;
		
		if(inicio > fim) {
			total = (inicio - 24) + fim;
			System.out.println("O JOGO DUROU "+total+" HORAS");
		}else if(inicio < fim) {
			
			
		}
		

	}

}
