package secao18.predicate.util;

import java.util.function.Predicate;

import secao18.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}

}
