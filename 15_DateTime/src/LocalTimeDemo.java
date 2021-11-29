import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

	public static void localTimeDemonstration () {
		LocalTime jetzt = LocalTime.now();
		
		LocalTime time = LocalTime.of(12, 30);
		LocalTime time2 = LocalTime.of(13, 45, 55, 123456);
		
		System.out.println(jetzt);
		System.out.println(time);
		System.out.println(time2);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(1979, 3, 25, 14, 30);
		
		LocalDateTime ldt3 = ldt2.withMonth(11);
		
		System.out.println(ldt);
		System.out.println(ldt2);
		System.out.println(ldt3);
		
		Period period = Period.of(2, 9, 4);
		
		LocalDateTime ldt4 = ldt2.plus(period);
		
		System.out.println(ldt4);
		
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("'Dies ist ein Datum: 'dd.MMMM.yyyy 'und eine Uhrzeit:'HH:mm");
//		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPatte
		System.out.println(ldt4.format(dtFormatter));
		
		
	}
}
