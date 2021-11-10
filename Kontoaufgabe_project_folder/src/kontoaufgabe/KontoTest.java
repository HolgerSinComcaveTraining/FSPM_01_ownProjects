package kontoaufgabe;

public class KontoTest {
	public static void kontoVergleich(Konto konto1, Konto konto2) {
		Person k1 = konto1.getPerson();
		Person k2 = konto2.getPerson();
		if (konto1.getKontostand() > konto2.getKontostand()) {
			System.out.println(k1.getName() + " hat mehr Geld auf dem Konto als " + k2.getName());
		} else {
			System.out.println(k2.getName() + " hat mehr Geld auf dem Konto als " + k1.getName());
		}
	}

	public static void main(String[] args) {
		Konto konto1 = new Konto("Müller", "Hans", 500);
		Konto konto2 = new Konto("Krause", "Peter", 1500);
		Konto konto3 = new Konto("Böhm", "Harald", 330);
		kontoVergleich(konto1, konto2);
		kontoVergleich(konto2, konto3);
		kontoVergleich(konto1, konto3);
	}
}