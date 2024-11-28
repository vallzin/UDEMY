package secao14exercicio.model.entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, 
			Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		
		if(amount > getWithdrawLimit()) {
			throw new RuntimeException("Withdraw error: The amount exceeds withdraw limit");
		} 
		if(amount > getBalance()){
			throw new RuntimeException("Not enough balance");
		} 
		
	}

}
