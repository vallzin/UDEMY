package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramDateFormatacao {

	public static void main(String[] args) {
		
		System.out.println();
		LocalDate d04 = LocalDate.parse("2024-11-17");
		System.out.println("d04 = "+ d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2024-11-17T01:23:25");
		System.out.println("d05 = "+ d05);
		
		Instant d06 = Instant.parse("2024-11-17T15:32:15Z");
		System.out.println("d06 = "+ d06);
		
		System.out.println();
		System.out.println("-*-  USANDO O 'DateTimeFormatter' -*-");
		System.out.println();
		
		DateTimeFormatter fmt1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("-------------------------");
		System.out.println("\tLocalDate");
		System.out.println("-------------------------\n");
		
		System.out.println("DateTimeFormatter fmt1 =  DateTimeFormatter.ofPattern(\"dd/MM/yyyy\");\n");
		System.out.println("d04 = "+ d04.format(fmt1));
		System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d04 = "+ fmt1.format(d04));
		System.out.println("-------------------------");
		System.out.println("\tLocalDateTime");
		System.out.println("-------------------------\n");
		System.out.println("DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern(\"dd/MM/yyyy HH:mm\");\n");
		System.out.println("d05 = "+ d05.format(fmt1));
		System.out.println("d05 = "+ d05.format(fmt2));
		System.out.println("-------------------------");
		System.out.println("\tInstant");
		System.out.println("-------------------------\n");
		System.out.println("DateTimeFormatter fmt3 =  DateTimeFormatter.ofPattern(\"dd/MM/yyyy HH:mm\").withZone(ZoneId.systemDefault());\n");
		System.out.println("d06 = "+ fmt3.format(d06));

	}

}
