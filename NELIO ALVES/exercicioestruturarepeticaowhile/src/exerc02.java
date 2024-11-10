

import java.util.Locale;
import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas x e y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		
		while(x != 0 && y != 0) {
			
			if( x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if( x > 0 && y < 0) {
				System.out.println("segundo");
			}else if( x < 0 && y < 0) {
				System.out.println("terceiro");
			}else if( x < 0 && y > 0) {
				System.out.println("quarto");
			}
			
			System.out.println("Digite as coordenadas x e y");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		
		
		sc.close();
		

	}

}
