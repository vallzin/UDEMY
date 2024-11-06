
public class Main {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("Área do Trapézio");
		System.out.println(area);
		System.out.println();
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double) a / c;
		
		System.out.println("Casting de variável 1");
		System.out.println(resultado);
		System.out.println();
		
		double d;
		int e;
		
		d = 5.0;
		e = (int)d;
		
		System.out.println("Casting de variável 2");
		System.out.println(e);

	}

}
