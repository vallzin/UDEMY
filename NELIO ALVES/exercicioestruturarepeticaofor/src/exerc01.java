import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor inteiro entre 1 e 1000: ");
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
