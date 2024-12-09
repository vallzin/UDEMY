package secao18.predicate.application;

import java.util.ArrayList;
import java.util.List;

import secao18.predicate.entities.Product;
import secao18.predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.00));

//		list.removeIf(p -> p.getPrice() >= 100);
		list.removeIf(new ProductPredicate());
		
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
	