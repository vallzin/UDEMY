package exerciciofixacao.entities;

public class Funcionarios {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionarios() {	}
	
	public Funcionarios(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double porcentagem) {
		
		salario+= salario * porcentagem / 100;
				
	}

	@Override
	public String toString() {
		return id + ", " + nome + String.format(" %.2f ", salario);
	}
	
	
}
