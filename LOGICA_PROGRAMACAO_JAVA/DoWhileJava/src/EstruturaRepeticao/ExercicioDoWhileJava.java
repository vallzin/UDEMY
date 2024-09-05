package EstruturaRepeticao;

import javax.swing.JOptionPane;


public class ExercicioDoWhileJava {

	public static void main(String[] args) {
		
		double num;

		do {
			
			num =  Double.parseDouble(JOptionPane.showInputDialog("Digite um número entre 1 e 5 para encerrar"));
			
			if(num < 1 || num > 5)
				System.out.println("Número inválido ou incorreto, tente novalmente");
			
		}while(num < 1 || num > 5);

		System.out.println("Encerrando algoritmo...");
	}

}
