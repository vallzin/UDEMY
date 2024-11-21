package exerciciofixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerciciofixacao.entities.ImportedProduct;
import exerciciofixacao.entities.Product;
import exerciciofixacao.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre the number of products: ");
		int n = sc.nextInt();
		
		Product p;
		ImportedProduct iProd;
		UsedProduct uProd;
		
		List<Product> prod = new ArrayList<>();
		
		for (int i = 0; i <n; i++) {
			System.out.println("Product #"+ (i + 1) +" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			if (ch == 'c') {	
				prod.add(new Product(name, price));	
			}else if (ch == 'u') {
				System.out.print("Manufacture date(DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
			
				prod.add(new UsedProduct(name, price, date));				
				
			}else{
				System.out.print("Custom fee: ");
				double fee = sc.nextDouble();
				sc.nextLine();
				
				prod.add(new ImportedProduct(name, price, fee));
						
			}

		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : prod) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();
	}

}

