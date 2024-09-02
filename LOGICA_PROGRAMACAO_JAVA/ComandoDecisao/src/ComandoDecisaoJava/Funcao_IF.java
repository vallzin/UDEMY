package ComandoDecisaoJava;

public class Funcao_IF {

	public static void main(String[] args) {
		
		
		int num = 10;
		int num2 = 20;
		String nome = "Val";
		/*
		 * '==' -> Igual <==> Equals
		 * '!=' -> Diferente
		 * '>'  -> Maior
		 * '<'  -> Menor
		 * '>=' -> Maior ou igual
		 * '<=' -> Menor ou igual
		 * */
		//If -> Se
		if(num >= 10) {
			
			System.out.println("O número é maior do que 10");
		// else -> Senão	
		}else {
			System.out.println("O número é menor do que 10");
		}
		
		//If -> Se
		if(num2 != 10) {
					
			System.out.println("O número é difetente de 10");
			// else -> Senão	
		}else {
				System.out.println("O número é menor do que 10");
		}
		
		if(nome.equals("Val")) {
			System.out.println("Esse é meu nome");
		}else {
			System.out.println("não conheço.");
		}
	}
}
