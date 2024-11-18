package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ProgramOperacaoComDataHora {

	public static void main(String[] args) {
		
		System.out.println();
		LocalDate d04 = LocalDate.parse("2024-11-17");
		System.out.println(" d04 = "+ d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2024-11-17T01:23:25");
		System.out.println(" d05 = "+ d05);
		
		Instant d06 = Instant.parse("2024-11-17T02:32:15Z");
		System.out.println(" d06 = "+ d06);
		
		System.out.println();
		System.out.println(" Converter data-hora global para local");
		System.out.println(" ° Data-hora gobal, timezone(sistema local) -> Data-hora local");
		
		LocalDate res1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("\n LocalDate res1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());");
		System.out.println(" res1 = "+ res1 +"\n");
		LocalDate res2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(" LocalDate res2 = LocalDate.ofInstant(d06, ZoneId.of(\"Portugal\"));");
		System.out.println(" res2 = "+ res2);
		LocalDateTime res3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("\n LocalDateTime res3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());");
		System.out.println(" res3 = "+ res3);
		LocalDateTime res4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("\n LocalDateTime res4 = LocalDateTime.ofInstant(d06, ZoneId.of(\"Portugal\"));");
		System.out.println(" res4 = "+ res4);
		
		System.out.println();
		System.out.println(" Obter dados de uma data-hora local");
		System.out.println(" ° Data-hora local -> dia, mês, ano, horário");
		System.out.println("\n d04 = "+ d04);
		System.out.println(" d04, dia = "+ d04.getDayOfMonth());
		System.out.println(" d04, mês = "+ d04.getMonthValue());
		System.out.println("\n d05 = "+ d05);
		System.out.println(" d04, ano = "+ d04.getYear());
		System.out.println(" d05 hora = "+ d05.getHour());
		System.out.println(" d05 minuto = "+ d05.getMinute());
		
		
		

	}

}
