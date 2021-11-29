import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void localDateDemonstration() {
	
		LocalDate heute = LocalDate.now();
		LocalDate datum = LocalDate.of(87, 3, 25);
		LocalDate datum2 = LocalDate.of(1980, 3, 25);
		LocalDate datum3 = LocalDate.of(1980, Month.MARCH, 25);
		
		
		System.out.println(heute);
		System.out.println(datum);
		System.out.println(datum2);
		System.out.println(datum3);
	}
	
	
	
	
}
