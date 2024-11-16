package exerciciofixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.Position;

import exerciciofixacao.entities.Funcionarios;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		List<Funcionarios> list = new ArrayList<>();
				
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Empregado #"+(i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			while(temId(list, id)) {
				System.out.println("Id exitente, tente novamente!");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, nome, salario);
			
			list.add(func);
		}
		
		System.out.println();
		System.out.print("Id do empregado para aumento do salario: ");
		int idSalario = sc.nextInt();
		
		Funcionarios func = list.stream().filter(x -> x.getId() == idSalario)
				.findFirst().orElse(null);
		
//		Integer pscId = posicaoId(list, idSalario);
		
		if (func == null) {
			System.out.println("Id inexistente");
		}else {
			System.out.print("Digite o valor da porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.aumentarSalario(porcentagem);
		}
		
		System.out.println();
		for (Funcionarios f : list)
			System.out.println(f);
		
		sc.close();
	}


//	public static Integer posicaoId(List<Funcionarios> list, int id) {
//	
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getId() == id) {
//				return i;
//			}
//		}
//		return null;
//	}
	
	public static boolean temId(List<Funcionarios> list, int id) {
		
		Funcionarios func = list.stream().filter(x -> x.getId() == id)
				.findFirst().orElse(null);
		return func != null;
		}
	
			
}
