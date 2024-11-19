package trabalhandocomdatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date year1 = sdf1.parse("25/06/2024");
		Date year2 = sdf2.parse("25/06/2024 15:21:05");
		Date year3 = Date.from(Instant.parse("2024-12-11T15:21:05Z"));
		
		
		System.out.println("--------------------------------");
		System.out.println("DATA SEM FORMATOS");
		System.out.println("--------------------------------");
		System.out.println("x1 = "+ x1);
		System.out.println("x2 = "+ x2);
		System.out.println("x3 = "+ x3);
		System.out.println("x4 = "+ x4);
		System.out.println("year1 = "+ year1);
		System.out.println("year2 = "+ year2);
		System.out.println("year3 = "+ year3);
		System.out.println("--------------------------------");
		System.out.println("DATAS FORMATADAS COM 'SimpleDateFormat'");
		System.out.println("--------------------------------");
		System.out.println("x1 = "+ sdf2.format(x1));
		System.out.println("x2 = "+ sdf2.format(x2));
		System.out.println("x3 = "+ sdf2.format(x3));
		System.out.println("x4 = "+ sdf2.format(x4));
		System.out.println("------------------------");
		System.out.println("year1 = "+ sdf2.format(year1));
		System.out.println("year2 = "+ sdf2.format(year2));
		System.out.println("year3 = "+ sdf2.format(year3));
		System.out.println("--------------------------------");
		System.out.println("SET TIME ZONE");
		System.out.println("--------------------------------");
		System.out.println("x1 = "+ sdf3.format(x1));
		System.out.println("x2 = "+ sdf3.format(x2));
		System.out.println("x3 = "+ sdf3.format(x3));
		System.out.println("x4 = "+ sdf3.format(x4));
		System.out.println("year1 = "+ sdf3.format(year1));
		System.out.println("year2 = "+ sdf3.format(year2));
		System.out.println("year3 = "+ sdf3.format(year3));
		
		
		

	}

}
