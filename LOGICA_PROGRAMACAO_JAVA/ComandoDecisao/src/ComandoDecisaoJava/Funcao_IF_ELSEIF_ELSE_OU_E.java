package ComandoDecisaoJava;

import javax.swing.JOptionPane;

public class Funcao_IF_ELSEIF_ELSE_OU_E {
	
	public static void main(String[] args) {
		
		/*
		 * || -> Ou
		 * && -> E
		 * */
		/*
		String fruta;
		fruta = JOptionPane.showInputDialog("Digite o nome da fruta");
		
		if(fruta.equals("Maçã") || fruta.equals("Banana")) {
			
			JOptionPane.showMessageDialog(null, "A fruta é "+fruta);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "fruta inválida ");
			
		}
		*/
		
		String fruta1, fruta2;
		
		fruta1 = JOptionPane.showInputDialog("Digite o nome da primeira fruta");
		fruta2 = JOptionPane.showInputDialog("Digite o nome da segunda fruta");
		
		/*
		if(fruta1.equals("Maçã") && fruta2.equals("Banana")) {
			JOptionPane.showMessageDialog(null, "Fruta 1: "+ fruta1);
			JOptionPane.showMessageDialog(null, "Fruta 2: "+ fruta2);
			
		}else {
			JOptionPane.showMessageDialog(null, "Não é Maçã e nem é Banana");
		}
		*/
		
		if(fruta1.equals("Maçã") && fruta2.equals("Banana")) {
			System.out.println("A fruta 1 é Maçã e a fruta 2 é Banana");
		}else {
			System.out.println("Você digitou as frutas erradas");
		}
		
	}

}
