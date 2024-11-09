import java.util.Locale;
import java.util.Scanner;

public class exer06 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três valores com dupla precisão");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.println("Área do Triângulo");
		double areaT = (A * C) / 2;
		System.out.printf("TRIÂNGULO: %.3f%n", areaT );
		System.out.println("Área do Círculo");
		double PI = 3.14159;
		double areaC = PI * Math.pow(C, 2);
		System.out.printf("CÍRCULO: %.3f%n", areaC );
		System.out.println("Área do Trapézio");
		double areaTp = (A + B) * C / 2;
		System.out.printf("TRAPÉZIO: %.3f%n", areaTp );
		System.out.println("Área quadrado");
		double areaQ = B * B;
		System.out.printf("QUADRADO: %.3f%n", areaQ );
		System.out.println("Área Retângulo");
		double areaR = A * B;
		System.out.printf("RETÂNGULO: %.3f%n", areaR );
		
		sc.close();
		
		
		
		
		
	}

}
