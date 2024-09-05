package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class ExercicioDoWhileJava2 {

	public static void main(String[] args) {
		
		int num;
		
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			if(num > 0) {
				System.out.println("Número positivo");
			}else if(num < 0) {
				System.out.println("Número negativo");
			}
		}while(num != 0);
		System.out.println("Encerrando programa");

	}

}
