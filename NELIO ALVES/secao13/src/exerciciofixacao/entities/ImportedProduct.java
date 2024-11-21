package exerciciofixacao.entities;

public class ImportedProduct extends Product{
	
	private Double customFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	@Override
	public String priceTag() {
		return getName()
				+ " $ "
				+	 String.format("%.2f", getPrice())
				+ " (Custom fee: "
				+ String.format("%.2f", customFee)
				+ ")"; 
	}
	
	public Double totalPrice(double customFee) {
		return getPrice() + customFee;
	}

}
