package ComandoDecisaoJava;

import javax.swing.JOptionPane;

public class Switch2 {
	
	public static void main(String[] args) {
		
		int mes = 4;
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome de uma fruta"));
		
		//switch -> Avalia o valor de uma variável e dependendo do resultado
		//ele entra em um caso e executa a ação
		//switch -> Selecione caso
		switch(mes) {
		
			//case -> caso
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("O mês está entre 1 e 5");
			//break -> encerra o programa
			break;
		case 6: case 7: case 8: case 9: case 10:
			System.out.println("O mês está entre 6 e 10");
			break;
		case 11: case 12:
			System.out.println("O mês está entre 11 e 12");
			break;
		//default -> outro caso não listado
		default:
			System.out.println("Você digitou um número de mês inválido");
		}
		
	}

}
