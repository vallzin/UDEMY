package secao18.exerciciofixacao.entities;

import java.util.Objects;

public class Employee {
	
	private String name;
	private String email;
	private Double salary;
	
	public Employee() {}

	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + "," + email + "," + salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(salary, other.salary);
	}
	
	
	
	

}
