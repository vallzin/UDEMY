package secao16.interfaces.herdarcontrato.model.entities;

import secao16.interfaces.herdarcontrato.model.enums.Color;

public class Circle extends AbstractShape{

	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
