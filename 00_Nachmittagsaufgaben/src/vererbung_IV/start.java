package vererbung_IV;

public class start {

	public static void main(String[] args) {
		

		Hilfsarbeiter hiwi = new Hilfsarbeiter(1, "Max Mustermann", "15.02.2009", 15, 145.5, 2.5, 20);
		System.out.println(hiwi + " und hat folgenden Monatslohn: " + hiwi.getMonatsLohn());
		
		Verkäufer v1 = new Verkäufer(2, "Berta Bertelsmann", "01.01.2010", 2500, 25731, 1.5);
		System.out.println(v1 + " hat folgenden Monatslohn: " + v1.getMonatsLohn());
	}

}
