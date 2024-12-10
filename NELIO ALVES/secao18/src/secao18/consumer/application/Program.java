package secao18.consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import secao18.consumer.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 800.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		
//		Implementação da Interface
//		list.forEach(new PriceUpdate());
		
//		Reference method com método estático
//		list.forEach(Product::staticPriceUpdate);
		
//		Reference method com método não estático
//		list.forEach(Product::nonStaticPriceUpdate);
		
		double factor = 1.1;
//		Expressão lambda declarada
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		
//		Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		
	}

}
