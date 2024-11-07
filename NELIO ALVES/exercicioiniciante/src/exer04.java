

import java.util.Locale;
import java.util.Scanner;

public class exer04 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Funcionário, digite seu número: ");
		int num = sc.nextInt();
		System.out.println("Funcionário, digite as horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Funcionário, digite o valor da hora: ");
		double valorH = sc.nextDouble();
		
		double salario = horas * valorH;
		
		System.out.println("NÚMERO: "+ num);
		System.out.println("SALÁRIO: "+ salario);
		
	}

}
