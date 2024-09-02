package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_Media_Aluno_Turma {

	public static void main(String[] args) {
		
		String aluno;
		float nota1, nota2, nota3, nota4, media, somaMedias, mediaTurma;
		
		somaMedias = 0;
		
		for(int i = 0; i <= 4; i++) {
			aluno = JOptionPane.showInputDialog("Nome do Aluno: ");
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));
			nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota:"));
			nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota:"));
		
			media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			somaMedias += media;
			
			System.out.println("Aluno: "+aluno);
			System.out.println("Média: "+media);
			
			if(media >= 6) {
				System.out.println("Aluno aprovado");
			}else {
				System.out.println("Aluno reprovado");
			}
		}
		mediaTurma = somaMedias / 4;
		System.out.println("\nMedia da turma: "+mediaTurma);
	}

}
