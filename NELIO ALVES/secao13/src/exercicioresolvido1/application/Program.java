package exercicioresolvido1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicioresolvido1.entities.Circle;
import exercicioresolvido1.entities.Rectangle;
import exercicioresolvido1.entities.Shape;
import exercicioresolvido1.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i <n; i++) {
			System.out.print("Shape #"+ (i + 1) +" date: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				sc.nextLine();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				sc.nextLine();
				list.add(new Rectangle(color, width, heigth));
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				sc.nextLine();
				list.add(new Circle(color, radius));
			}
			
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
			
		}
		
		sc.close();

	}

}
