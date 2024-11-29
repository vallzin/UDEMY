package secao15trabalhandocomarquivos.classfileescanner;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("F:\\UDEMY\\NELIO ALVES\\in.txt");
		
		Scanner sc = null;
		try
		{
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch( Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally
		{
			if(sc != null)
			{
			sc.close();
			}
		}

	}

}
