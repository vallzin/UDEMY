package exercicio;

public class Rectangle {

	public double width;
	public double height;
	public double perimeter;
	public double diagonal;
	

	public double area() {
		
		return this.width * this.height;
		
	}
	
	public double perimeter() {
		
		return perimeter = 2 * (this.width + this.height);
		
	}
	
	public double diagonal() {
		
		diagonal = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
		return diagonal;
		
	}
	
	public String toString() {
		return "AREA = " + area()
				+ "\nPERIMETER = " + perimeter()
				+ "\nDIAGONAL = " + diagonal();
	}
}
