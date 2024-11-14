package exerciciofixacao;

import java.util.Locale;
import java.util.Scanner;

public class CotacaoDollarTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CotacaoDollar ctDollar = new CotacaoDollar();
		
		System.out.print("What is the dollar price? ");
		ctDollar.price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		ctDollar.quantity = sc.nextDouble();
		
		System.out.println(ctDollar);
		
		sc.close();

	}

}
