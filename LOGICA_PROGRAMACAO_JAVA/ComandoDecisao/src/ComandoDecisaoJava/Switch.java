package ComandoDecisaoJava;

import javax.swing.JOptionPane;

public class Switch {
	
	public static void main(String[] args) {
		
		String fruta;
		
		fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta");
		
		//switch -> Avalia o valor de uma variável e dependendo do resultado
		//ele entra em um caso e executa a ação
		//switch -> Selecione caso
		switch(fruta) {
		
			//case -> caso
		case "Banana":
			System.out.println("Você digitou Banana");
			break;
		case "Laranja":
			System.out.println("Você digitou Laranja");
			break;
		case "Uva":
			System.out.println("Você digitou Uva");
			break;
		default:
			System.out.println("Você não digitou uma fruta válida");
		}
		
	}

}
