package Program;

import java.util.Locale;
import java.util.Scanner;

import exercicio.Student;

public class StudentProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.println("Digite o nome do Estudante e suas três notas");
		std.nome = sc.nextLine();
		std.nota1 = sc.nextDouble();
		sc.nextLine();
		std.nota2 = sc.nextDouble();
		sc.nextLine();
		std.nota3 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println(std);
		
		sc.close();

	}

}
