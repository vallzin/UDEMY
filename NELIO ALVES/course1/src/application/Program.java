package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		System.out.print("Enter product data: ");
		System.out.print("Name: ");
		prod.name = sc.nextLine();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity in stock ");
		prod.quantity = sc.nextInt();
		
		System.out.println(prod.name +", "+ prod.price+", "+prod.quantity);
		

	}

}
