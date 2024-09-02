package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class NumerosImpares {

	public static void main(String[] args) {
		
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo maior que 1","Leia com atenão!"));
		
		for(int i = 1; i <= num; i++) {
			
			if(i %2 != 0) {
				System.out.println(i);
			}
		}
		
	}
}
