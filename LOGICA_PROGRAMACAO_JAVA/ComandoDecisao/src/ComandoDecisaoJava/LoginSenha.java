package ComandoDecisaoJava;

import java.util.Scanner;

public class LoginSenha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite sua senha:");
		String senha = sc.nextLine();
		
		if(nome.equals("Roger") && senha.equals("123")) {
			System.out.printf("Usuário %s logado com sucesso!", nome);
		}else {
			System.out.println("Usuário ou senha inválido");
		}

	}

}
