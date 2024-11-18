package secao11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {

	public static void main(String[] args) {

		System.out.println();
		System.out.println(" Cálculos com data-hora");
			
		LocalDate d04 = LocalDate.parse("2024-11-17");
		System.out.println("\n d04 = "+ d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2024-11-17T01:23:25");
		System.out.println(" d05 = "+ d05);
		
		Instant d06 = Instant.parse("2024-11-17T15:32:15Z");
		System.out.println(" d06 = "+ d06);
		System.out.println("\n ° Data-hora +/- tempo -> Data-hora");
		
		System.out.println("\n LocalDate");
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println(" semana atual: "+ d04 +" ,"+"semana anterior: "+pastWeekLocalDate);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println(" semana atual: "+ d04 +" ,"+"próxima semana: "+nextWeekLocalDate);

		System.out.println("\n LocalDateTime");
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		System.out.println(" semana atual: "+ d05 +" ,"+"semana anterior: "+pastWeekLocalDateTime);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println(" semana atual: "+ d05 +" ,"+"próxima semana: "+nextWeekLocalDateTime);

		System.out.println("\n Instante");
		Instant pastWeekInstant = d06.minus(-7, ChronoUnit.DAYS);
		System.out.println(" semana atual: "+ d06 +" ,"+"semana anterior: "+pastWeekInstant);
		Instant nextWeekInstant = d06.plus(-7, ChronoUnit.DAYS);
		System.out.println(" semana atual: "+ d06 +" ,"+"próxima semana: "+nextWeekInstant);

		System.out.println("\n ° Data-hora 1, Data-hora 2 -> Duração");
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("\n Duration t1 = Duration.between(pastWeekLocalDateTime, d05);");
		System.out.println(" t1 dias = "+ t1.toDays());
		System.out.println("------------------------------");
		System.out.println(" Não dá pra calcular com localDate, 'LocalDate' não tem informação de tempo");
		System.out.println(" Duration t2 = Duration.between(pastWeekLocalDate, d04);");
		System.out.println(" Tem que fazer conversão para 'LocalDateTime'");
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		System.out.println(" 1ª forma de conversão");
		System.out.println(" Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));");
		System.out.println(" t2 dias = "+ t2.toDays());
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println(" 2ª forma de conversão");
		System.out.println(" Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()));");
		System.out.println(" t2 dias = "+ t3.toDays());
		System.out.println("------------------------------");
		Duration t4 = Duration.between(pastWeekInstant, d06);
		System.out.println(" Duration t4 = Duration.between(pastWeekInstant, d06);");
		System.out.println(" t4 dias = "+ t4.toDays());
		Duration t5 = Duration.between(d06, pastWeekInstant);
		System.out.println(" Duration t4 = Duration.between(d06, pastWeekInstant);");
		System.out.println(" t4 dias = "+ t5.toDays());
		
		
		
		
		

	}

}
