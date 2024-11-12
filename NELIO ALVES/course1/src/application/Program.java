package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.name = sc.nextLine();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity in stock ");
		prod.quantity = sc.nextInt();
		
		
		System.out.println();
		System.out.println("Product data: " + prod);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		prod.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + prod);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		prod.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Product data: " + prod);
		
		
		
		
		sc.close();

	}

}
