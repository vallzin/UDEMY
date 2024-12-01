package secao15trabalhandocomarquivos.exerciciofixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import secao15trabalhandocomarquivos.exerciciofixacao.entities.Product;
import secao15trabalhandocomarquivos.exerciciofixacao.entities.SourceFile;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SourceFile sourceFile = new SourceFile();
		
		System.out.println("Digite o caminho para criar o arquivo: ");
		String sourceFileStr = sc.nextLine();
		
		sourceFile.setPath(sourceFileStr);			
		
		System.out.print("Quantos produtos serão cadastrados? ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o preço: ");
			double price = sc.nextDouble();
			System.out.print("Digite a quantidade: ");
			sc.nextLine();
			int quantity = sc.nextInt();
			
			Product produto = new Product(name, price, quantity);
			sourceFile.addProduct(produto);
			
		}
		
		System.out.println();
		for (Product p : sourceFile.getProd()) {
			System.out.println(p);
		}
		
		sourceFile.addProd();
		sourceFile.addFolder();
		
		System.out.println("Digite o caminho e o nome do arquivo de reescrita: ");
		String filePath = sc.next();
		
		sourceFile.setPath(filePath);
		
		sourceFile.calcProd();

		sc.close();

	}
	
	

}
