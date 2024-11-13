package Program;

import java.util.Locale;
import java.util.Scanner;

import exercicio.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		
		double area = rect.area();
		System.out.println("AREA: "+ area);
		double perimeter = rect.perimeter();
		System.out.println("PERIMETER: " + perimeter);
		double diagonal = rect.diagonal();
		System.out.println("DIAGONAL: " + diagonal);
		
		
		sc.close();
		

	}

}
