package exercicio;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public Student() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getNota3() {
		return nota3;
	}
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
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
