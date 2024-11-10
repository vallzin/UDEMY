import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor inteiro entre 1 e 10: ");
		
		int N = sc.nextInt();
		int somaIn = 0;
		int somaOut = 0;
		
		for(int i = 0; i < N; i++) {
			
			int num = sc.nextInt();
			
			if(num >= 10 && num <=20) {
				somaIn++;
				
			}else {
				
				somaOut++;
			}
			
		}
		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");
		
		
		sc.close();

	}

}
