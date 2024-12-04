package secao16.interfaces.herdarcontrato.application;

import secao16.interfaces.herdarcontrato.model.entities.AbstractShape;
import secao16.interfaces.herdarcontrato.model.entities.Circle;
import secao16.interfaces.herdarcontrato.model.entities.Rectangle;
import secao16.interfaces.herdarcontrato.model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape sh1 = new Circle(Color.BLACK, 2.0);
		AbstractShape sh2 = new Rectangle(Color.BLACK, 3.0, 4.0);
		
		System.out.println("Circle color: " + sh1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", sh1.area()));
		System.out.println("Rectangle color: " + sh2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", sh2.area()));

	}

}
