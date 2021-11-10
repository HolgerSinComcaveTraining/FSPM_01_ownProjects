package kontoaufgabe;

public class Konto {
	private Person person;
	private double kontostand;

	public Konto(String name, String vorname, float kontostand) {
		this(new Person(name, vorname), kontostand);
	}

	/**
	 * @param person
	 * @param kontostand
	 */
	public Konto(Person person, double kontostand) {
		this.person = person;
		this.kontostand = kontostand;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	

}