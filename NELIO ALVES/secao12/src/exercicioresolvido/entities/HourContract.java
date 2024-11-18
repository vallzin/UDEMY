package exercicioresolvido.entities;

import java.util.Date;

public class HourContract{
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {		
	}

	public HourContract(Date date, Double valuePerHour, Integer hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return hours;
	}

	public void setHour(Integer hour) {
		this.hours = hour;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
	
}
