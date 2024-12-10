package secao18.function.util;

import java.util.function.Function;

import secao18.function.entities.Product;

public class UperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
