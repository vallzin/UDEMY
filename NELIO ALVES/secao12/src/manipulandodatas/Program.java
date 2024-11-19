package manipulandodatas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dt = Date.from(Instant.parse("2024-11-17T11:12:30Z"));
		
		System.out.println("------------------------------------");
		System.out.println(" IMPRIMINDO UM DATE");
		System.out.println("------------------------------------");
		
		System.out.println();
		System.out.println(dt);
		System.out.println();
		
		System.out.println("------------------------------------");
		System.out.println(" SOMANDO UMA UNIDADE DE TEMPO");
		System.out.println("------------------------------------");
		System.out.println();
		Calendar cldr = Calendar.getInstance();
		cldr.setTime(dt);
		cldr.add(Calendar.HOUR_OF_DAY, 4);//acrescentando 4 horas a data
		dt = cldr.getTime();
		
		System.out.println(" "+ sdf.format(dt));
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println(" OBTENDO UMA UNIDADE DE TEMPO");
		System.out.println("------------------------------------");
		System.out.println();
		
//		Calendar cldr = Calendar.getInstance(); //já foi instanciado acima
//		cldr.setTime(dt); //já foi instanciado acima
		int minutes = cldr.get(Calendar.MINUTE);
		int month = 1 + cldr.get(Calendar.MONTH);
		
		System.out.println(" "+ minutes +" -> minutos da impressão date");
		System.out.println(" "+ month+" -> mês da impressão date");
		System.out.println();
		

	}

}
