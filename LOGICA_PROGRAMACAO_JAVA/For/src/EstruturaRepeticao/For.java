package EstruturaRepeticao;

public class For {
	public static void main(String[] args) {
		
		//for -> Para
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.print(contador+" ");
			
		}
		System.out.println();
		
		for(int contador = 10; contador >=1; contador--) {
			System.out.print(contador+" ");
			
		}
		System.out.println();
		for(int contador = 2; contador <= 10; contador+=2) {
			
			System.out.print(contador+" ");
			
		}
		System.out.println();
	}
}
