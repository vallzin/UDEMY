package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo: ", "Tabuada", JOptionPane.QUESTION_MESSAGE));
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
		}
	}
}
