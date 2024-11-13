package exercicio;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double gradeFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public double pontosRestantes() {
		
		double ptRestantes = 0;
		double notaMinima = 60.00;
		if(gradeFinal() < notaMinima) {
			ptRestantes = notaMinima - gradeFinal();
		}
		return ptRestantes;
	}
	
	public String resultado() {
		
		String resultado;
		double notaMinima = 60.00;
		if(gradeFinal() >= notaMinima) {
			resultado = "PASS";
		}else {
			resultado = "FAILED" + "\n MISSING "
					+ String.format("%.2f", pontosRestantes()) + " POINTS";
		}
		return  resultado;			
	}
	
	public String toString() {
		
		 String s = " FINAL GRADE = "+String.format("%.2f", gradeFinal())
				+ "\n " + resultado();
		 return s;
	}

}
