package secao18.function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import secao18.function.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 80.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("TV", 80.00));
		
		
//		Implementação da Interface
//		List<String> names = list.stream().map(new UperCaseName()).collect(Collectors.toList());
		
//		Reference method com método estático
//		List<String> names = list.stream().map(Product::staticUperCaseName).collect(Collectors.toList());
		
//		Reference method com método não estático
//		List<String> names = list.stream().map(Product::nonStaticUperCaseName).collect(Collectors.toList());
		
//		Expressão lambada declarada
//		Function<Product, String> func  = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}

}
