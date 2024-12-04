package secao16.interfaces.herdarcontrato.model.entities;

import secao16.interfaces.herdarcontrato.model.enums.Color;

public abstract class AbstractShape implements Shape{
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	

}
