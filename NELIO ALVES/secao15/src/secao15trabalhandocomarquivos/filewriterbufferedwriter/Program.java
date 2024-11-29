package secao15trabalhandocomarquivos.filewriterbufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morningh", "Good afternoon","Good night"};
		
		String path = "F:\\UDEMY\\NELIO ALVES\\out.txt";
		
		//o parametro true indica que o arquivo não será recriado apenas escrito no final
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
				

	}

}
