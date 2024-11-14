package entities;

public class ContaBanco {
	
	public static final double TAXA = 5.00;
	
	private int numConta;
	private String nome;
	private double saldo;		

	public ContaBanco(int numConta, String nome,double depositoInicio) {
		this.numConta = numConta;
		this.nome = nome;
		depositar(depositoInicio);
	}

	public ContaBanco(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {	
		saldo += valor; 	
	}
	
	public void sacar(double valor) {				
		saldo -= valor + TAXA;		
	}
	
	public String toString() {
		return "Conta Bancária: "
				+ numConta
				+ ", titular: "
				+ nome
				+ ", Saldo: R$"
				+ String.format("%.2f", saldo);
				
	}
	
}
